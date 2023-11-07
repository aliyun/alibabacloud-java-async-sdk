// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrailStatusRequest} extends {@link RequestModel}
 *
 * <p>GetTrailStatusRequest</p>
 */
public class GetTrailStatusRequest extends Request {
    @Query
    @NameInMap("IsOrganizationTrail")
    private Boolean isOrganizationTrail;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    private GetTrailStatusRequest(Builder builder) {
        super(builder);
        this.isOrganizationTrail = builder.isOrganizationTrail;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTrailStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isOrganizationTrail
     */
    public Boolean getIsOrganizationTrail() {
        return this.isOrganizationTrail;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<GetTrailStatusRequest, Builder> {
        private Boolean isOrganizationTrail; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(GetTrailStatusRequest request) {
            super(request);
            this.isOrganizationTrail = request.isOrganizationTrail;
            this.name = request.name;
        } 

        /**
         * Specifies whether to query the status of a multi-account trail. Valid values:
         * <p>
         * 
         * *   true: Query the status of a multi-account trail.
         * *   false: Query the status of a single-account trail. It is the default value.
         */
        public Builder isOrganizationTrail(Boolean isOrganizationTrail) {
            this.putQueryParameter("IsOrganizationTrail", isOrganizationTrail);
            this.isOrganizationTrail = isOrganizationTrail;
            return this;
        }

        /**
         * The name of the trail.
         * <p>
         * 
         * The name must be 6 to 36 characters in length. The name must start with a lowercase letter and can contain lowercase letters, digits, hyphens (-), and underscores (\_).
         * 
         * > The name must be unique within your Alibaba Cloud account.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public GetTrailStatusRequest build() {
            return new GetTrailStatusRequest(this);
        } 

    } 

}
