// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QueryPageByApplyIdRequest} extends {@link RequestModel}
 *
 * <p>QueryPageByApplyIdRequest</p>
 */
public class QueryPageByApplyIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long applyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    private QueryPageByApplyIdRequest(Builder builder) {
        super(builder);
        this.applyId = builder.applyId;
        this.currentPage = builder.currentPage;
        this.iotInstanceId = builder.iotInstanceId;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPageByApplyIdRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applyId
     */
    public Long getApplyId() {
        return this.applyId;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<QueryPageByApplyIdRequest, Builder> {
        private Long applyId; 
        private Integer currentPage; 
        private String iotInstanceId; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(QueryPageByApplyIdRequest request) {
            super(request);
            this.applyId = request.applyId;
            this.currentPage = request.currentPage;
            this.iotInstanceId = request.iotInstanceId;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The ID of the application. You can view the application ID in the response of the <a href="https://help.aliyun.com/document_detail/69514.html">BatchRegisterDeviceWithApplyId</a> or <a href="https://help.aliyun.com/document_detail/69473.html">BatchRegisterDevice</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1295006</p>
         */
        public Builder applyId(Long applyId) {
            this.putQueryParameter("ApplyId", applyId);
            this.applyId = applyId;
            return this;
        }

        /**
         * <p>The number of the page to return. Default value: 1.</p>
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
         * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
         * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
         * </ul>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot_instc_pu****_c*-v64********</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Maximum value: 50. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public QueryPageByApplyIdRequest build() {
            return new QueryPageByApplyIdRequest(this);
        } 

    } 

}
