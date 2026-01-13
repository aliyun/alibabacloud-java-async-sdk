// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safconsole20250521.models;

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
 * {@link CreateCustomerModuleOutputInfoRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomerModuleOutputInfoRequest</p>
 */
public class CreateCustomerModuleOutputInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerModuleId")
    private Integer customerModuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FinalScoreFormat")
    private String finalScoreFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessExpression")
    private String processExpression;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TestFileUrl")
    private String testFileUrl;

    private CreateCustomerModuleOutputInfoRequest(Builder builder) {
        super(builder);
        this.customerModuleId = builder.customerModuleId;
        this.finalScoreFormat = builder.finalScoreFormat;
        this.processExpression = builder.processExpression;
        this.testFileUrl = builder.testFileUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomerModuleOutputInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customerModuleId
     */
    public Integer getCustomerModuleId() {
        return this.customerModuleId;
    }

    /**
     * @return finalScoreFormat
     */
    public String getFinalScoreFormat() {
        return this.finalScoreFormat;
    }

    /**
     * @return processExpression
     */
    public String getProcessExpression() {
        return this.processExpression;
    }

    /**
     * @return testFileUrl
     */
    public String getTestFileUrl() {
        return this.testFileUrl;
    }

    public static final class Builder extends Request.Builder<CreateCustomerModuleOutputInfoRequest, Builder> {
        private Integer customerModuleId; 
        private String finalScoreFormat; 
        private String processExpression; 
        private String testFileUrl; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomerModuleOutputInfoRequest request) {
            super(request);
            this.customerModuleId = request.customerModuleId;
            this.finalScoreFormat = request.finalScoreFormat;
            this.processExpression = request.processExpression;
            this.testFileUrl = request.testFileUrl;
        } 

        /**
         * <p>Customer model ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder customerModuleId(Integer customerModuleId) {
            this.putQueryParameter("CustomerModuleId", customerModuleId);
            this.customerModuleId = customerModuleId;
            return this;
        }

        /**
         * <p>Number of decimal places to retain.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder finalScoreFormat(String finalScoreFormat) {
            this.putQueryParameter("FinalScoreFormat", finalScoreFormat);
            this.finalScoreFormat = finalScoreFormat;
            return this;
        }

        /**
         * <p>Score processing logic.</p>
         * 
         * <strong>example:</strong>
         * <p>score</p>
         */
        public Builder processExpression(String processExpression) {
            this.putQueryParameter("ProcessExpression", processExpression);
            this.processExpression = processExpression;
            return this;
        }

        /**
         * <p>Test file URL.</p>
         * 
         * <strong>example:</strong>
         * <p>customer/xxxxxxxxx/xxxxxxxx.pmml</p>
         */
        public Builder testFileUrl(String testFileUrl) {
            this.putQueryParameter("TestFileUrl", testFileUrl);
            this.testFileUrl = testFileUrl;
            return this;
        }

        @Override
        public CreateCustomerModuleOutputInfoRequest build() {
            return new CreateCustomerModuleOutputInfoRequest(this);
        } 

    } 

}
