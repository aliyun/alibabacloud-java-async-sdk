// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSpaceWithOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateSpaceWithOrderRequest</p>
 */
public class CreateSpaceWithOrderRequest extends Request {
    @Body
    @NameInMap("Desc")
    @Validation(maxLength = 128)
    private String desc;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("PackageVersion")
    private String packageVersion;

    @Body
    @NameInMap("Period")
    private Integer period;

    @Body
    @NameInMap("SubscriptionType")
    @Validation(required = true)
    private String subscriptionType;

    @Body
    @NameInMap("UseCoupon")
    private Boolean useCoupon;

    private CreateSpaceWithOrderRequest(Builder builder) {
        super(builder);
        this.desc = builder.desc;
        this.name = builder.name;
        this.packageVersion = builder.packageVersion;
        this.period = builder.period;
        this.subscriptionType = builder.subscriptionType;
        this.useCoupon = builder.useCoupon;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSpaceWithOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return packageVersion
     */
    public String getPackageVersion() {
        return this.packageVersion;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return subscriptionType
     */
    public String getSubscriptionType() {
        return this.subscriptionType;
    }

    /**
     * @return useCoupon
     */
    public Boolean getUseCoupon() {
        return this.useCoupon;
    }

    public static final class Builder extends Request.Builder<CreateSpaceWithOrderRequest, Builder> {
        private String desc; 
        private String name; 
        private String packageVersion; 
        private Integer period; 
        private String subscriptionType; 
        private Boolean useCoupon; 

        private Builder() {
            super();
        } 

        private Builder(CreateSpaceWithOrderRequest request) {
            super(request);
            this.desc = request.desc;
            this.name = request.name;
            this.packageVersion = request.packageVersion;
            this.period = request.period;
            this.subscriptionType = request.subscriptionType;
            this.useCoupon = request.useCoupon;
        } 

        /**
         * Desc.
         */
        public Builder desc(String desc) {
            this.putBodyParameter("Desc", desc);
            this.desc = desc;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PackageVersion.
         */
        public Builder packageVersion(String packageVersion) {
            this.putBodyParameter("PackageVersion", packageVersion);
            this.packageVersion = packageVersion;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(Integer period) {
            this.putBodyParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * SubscriptionType.
         */
        public Builder subscriptionType(String subscriptionType) {
            this.putBodyParameter("SubscriptionType", subscriptionType);
            this.subscriptionType = subscriptionType;
            return this;
        }

        /**
         * UseCoupon.
         */
        public Builder useCoupon(Boolean useCoupon) {
            this.putBodyParameter("UseCoupon", useCoupon);
            this.useCoupon = useCoupon;
            return this;
        }

        @Override
        public CreateSpaceWithOrderRequest build() {
            return new CreateSpaceWithOrderRequest(this);
        } 

    } 

}
