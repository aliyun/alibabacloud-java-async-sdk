// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link DescribeNameListPageListRequest} extends {@link RequestModel}
 *
 * <p>DescribeNameListPageListRequest</p>
 */
public class DescribeNameListPageListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("currentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("updateBeginTime")
    private Long updateBeginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("updateEndTime")
    private Long updateEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("variableId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long variableId;

    private DescribeNameListPageListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.regId = builder.regId;
        this.updateBeginTime = builder.updateBeginTime;
        this.updateEndTime = builder.updateEndTime;
        this.value = builder.value;
        this.variableId = builder.variableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNameListPageListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return updateBeginTime
     */
    public Long getUpdateBeginTime() {
        return this.updateBeginTime;
    }

    /**
     * @return updateEndTime
     */
    public Long getUpdateEndTime() {
        return this.updateEndTime;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    /**
     * @return variableId
     */
    public Long getVariableId() {
        return this.variableId;
    }

    public static final class Builder extends Request.Builder<DescribeNameListPageListRequest, Builder> {
        private String lang; 
        private Integer currentPage; 
        private Integer pageSize; 
        private String regId; 
        private Long updateBeginTime; 
        private Long updateEndTime; 
        private String value; 
        private Long variableId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNameListPageListRequest request) {
            super(request);
            this.lang = request.lang;
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.regId = request.regId;
            this.updateBeginTime = request.updateBeginTime;
            this.updateEndTime = request.updateEndTime;
            this.value = request.value;
            this.variableId = request.variableId;
        } 

        /**
         * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
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
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("currentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Page size, default value is 10</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Region code</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * <p>Update start time.</p>
         * 
         * <strong>example:</strong>
         * <p>1753372800000</p>
         */
        public Builder updateBeginTime(Long updateBeginTime) {
            this.putQueryParameter("updateBeginTime", updateBeginTime);
            this.updateBeginTime = updateBeginTime;
            return this;
        }

        /**
         * <p>Update end time.</p>
         * 
         * <strong>example:</strong>
         * <p>1753459199059</p>
         */
        public Builder updateEndTime(Long updateEndTime) {
            this.putQueryParameter("updateEndTime", updateEndTime);
            this.updateEndTime = updateEndTime;
            return this;
        }

        /**
         * <p>Variable name/description</p>
         * 
         * <strong>example:</strong>
         * <p>白名单</p>
         */
        public Builder value(String value) {
            this.putQueryParameter("value", value);
            this.value = value;
            return this;
        }

        /**
         * <p>Variable ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>762</p>
         */
        public Builder variableId(Long variableId) {
            this.putQueryParameter("variableId", variableId);
            this.variableId = variableId;
            return this;
        }

        @Override
        public DescribeNameListPageListRequest build() {
            return new DescribeNameListPageListRequest(this);
        } 

    } 

}
