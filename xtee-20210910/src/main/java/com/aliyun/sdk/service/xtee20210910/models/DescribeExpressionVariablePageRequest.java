// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExpressionVariablePageRequest} extends {@link RequestModel}
 *
 * <p>DescribeExpressionVariablePageRequest</p>
 */
public class DescribeExpressionVariablePageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("currentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("eventCode")
    private String eventCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("outputs")
    private String outputs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    private DescribeExpressionVariablePageRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.currentPage = builder.currentPage;
        this.eventCode = builder.eventCode;
        this.outputs = builder.outputs;
        this.pageSize = builder.pageSize;
        this.regId = builder.regId;
        this.status = builder.status;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExpressionVariablePageRequest create() {
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
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return eventCode
     */
    public String getEventCode() {
        return this.eventCode;
    }

    /**
     * @return outputs
     */
    public String getOutputs() {
        return this.outputs;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<DescribeExpressionVariablePageRequest, Builder> {
        private String lang; 
        private String currentPage; 
        private String eventCode; 
        private String outputs; 
        private String pageSize; 
        private String regId; 
        private String status; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(DescribeExpressionVariablePageRequest request) {
            super(request);
            this.lang = request.lang;
            this.currentPage = request.currentPage;
            this.eventCode = request.eventCode;
            this.outputs = request.outputs;
            this.pageSize = request.pageSize;
            this.regId = request.regId;
            this.status = request.status;
            this.value = request.value;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * currentPage.
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("currentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * eventCode.
         */
        public Builder eventCode(String eventCode) {
            this.putQueryParameter("eventCode", eventCode);
            this.eventCode = eventCode;
            return this;
        }

        /**
         * outputs.
         */
        public Builder outputs(String outputs) {
            this.putQueryParameter("outputs", outputs);
            this.outputs = outputs;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * value.
         */
        public Builder value(String value) {
            this.putQueryParameter("value", value);
            this.value = value;
            return this;
        }

        @Override
        public DescribeExpressionVariablePageRequest build() {
            return new DescribeExpressionVariablePageRequest(this);
        } 

    } 

}
