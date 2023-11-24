// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserAnalyzerRequest} extends {@link RequestModel}
 *
 * <p>CreateUserAnalyzerRequest</p>
 */
public class CreateUserAnalyzerRequest extends Request {
    @Body
    @NameInMap("business")
    private String business;

    @Body
    @NameInMap("businessAppGroupId")
    private String businessAppGroupId;

    @Body
    @NameInMap("businessType")
    private String businessType;

    @Body
    @NameInMap("name")
    private String name;

    @Body
    @NameInMap("type")
    private String type;

    @Query
    @NameInMap("dryRun")
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
         * business.
         */
        public Builder business(String business) {
            this.putBodyParameter("business", business);
            this.business = business;
            return this;
        }

        /**
         * businessAppGroupId.
         */
        public Builder businessAppGroupId(String businessAppGroupId) {
            this.putBodyParameter("businessAppGroupId", businessAppGroupId);
            this.businessAppGroupId = businessAppGroupId;
            return this;
        }

        /**
         * businessType.
         */
        public Builder businessType(String businessType) {
            this.putBodyParameter("businessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * dryRun.
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
