// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeImageBuildRiskByKeyRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageBuildRiskByKeyRequest</p>
 */
public class DescribeImageBuildRiskByKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUuid")
    private String imageUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskKey")
    private String riskKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    private DescribeImageBuildRiskByKeyRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.imageUuid = builder.imageUuid;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.riskKey = builder.riskKey;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageBuildRiskByKeyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return imageUuid
     */
    public String getImageUuid() {
        return this.imageUuid;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return riskKey
     */
    public String getRiskKey() {
        return this.riskKey;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeImageBuildRiskByKeyRequest, Builder> {
        private Integer currentPage; 
        private String imageUuid; 
        private String lang; 
        private Integer pageSize; 
        private String riskKey; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageBuildRiskByKeyRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.imageUuid = request.imageUuid;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.riskKey = request.riskKey;
            this.status = request.status;
        } 

        /**
         * <p>The page number. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The UUID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>a910053dd4710173ecc9e9d8931f****</p>
         */
        public Builder imageUuid(String imageUuid) {
            this.putQueryParameter("ImageUuid", imageUuid);
            this.imageUuid = imageUuid;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
         * <blockquote>
         * <p> We recommend that you do not leave this parameter empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The key of the risk rule. </p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeImageBuildRiskList~~">DescribeImageBuildRiskList</a> operation to obtain the value of <strong>RiskKey</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>no_user</p>
         */
        public Builder riskKey(String riskKey) {
            this.putQueryParameter("RiskKey", riskKey);
            this.riskKey = riskKey;
            return this;
        }

        /**
         * <p>The status of the alert event. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: unhandled.</li>
         * <li><strong>1</strong>: ignored.</li>
         * <li><strong>2</strong>: false positive.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeImageBuildRiskByKeyRequest build() {
            return new DescribeImageBuildRiskByKeyRequest(this);
        } 

    } 

}
