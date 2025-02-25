// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserAnalyzerRequest} extends {@link RequestModel}
 *
 * <p>CreateUserAnalyzerRequest</p>
 */
public class CreateUserAnalyzerRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("business")
    private String business;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("businessAppGroupId")
    private String businessAppGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("businessType")
    private String businessType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dryRun")
    private Boolean dryRun;

    private CreateUserAnalyzerRequest(Builder builder) {
        super(builder);
        this.business = builder.business;
        this.businessAppGroupId = builder.businessAppGroupId;
        this.businessType = builder.businessType;
        this.name = builder.name;
        this.type = builder.type;
        this.dryRun = builder.dryRun;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserAnalyzerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return business
     */
    public String getBusiness() {
        return this.business;
    }

    /**
     * @return businessAppGroupId
     */
    public String getBusinessAppGroupId() {
        return this.businessAppGroupId;
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static final class Builder extends Request.Builder<CreateUserAnalyzerRequest, Builder> {
        private String business; 
        private String businessAppGroupId; 
        private String businessType; 
        private String name; 
        private String type; 
        private Boolean dryRun; 

        private Builder() {
            super();
        } 

        private Builder(CreateUserAnalyzerRequest request) {
            super(request);
            this.business = request.business;
            this.businessAppGroupId = request.businessAppGroupId;
            this.businessType = request.businessType;
            this.name = request.name;
            this.type = request.type;
            this.dryRun = request.dryRun;
        } 

        /**
         * The basic analyzer.
         */
        public Builder business(String business) {
            this.putBodyParameter("business", business);
            this.business = business;
            return this;
        }

        /**
         * The application ID of the custom analyzer.
         */
        public Builder businessAppGroupId(String businessAppGroupId) {
            this.putBodyParameter("businessAppGroupId", businessAppGroupId);
            this.businessAppGroupId = businessAppGroupId;
            return this;
        }

        /**
         * The basic analyzer type. Valid values: AUTO, MODEL, SYSTEM, and USER.
         */
        public Builder businessType(String businessType) {
            this.putBodyParameter("businessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * The analyzer name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * The engine type. Valid values: HA3 and ES.
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * Specifies whether to perform only a dry run, without performing the actual request. Default value: false.
         * <p>
         * 
         * Valid values:
         * 
         * *   **true**
         * *   **false**
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        @Override
        public CreateUserAnalyzerRequest build() {
            return new CreateUserAnalyzerRequest(this);
        } 

    } 

}
