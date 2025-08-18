// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link GetTrailStatusRequest} extends {@link RequestModel}
 *
 * <p>GetTrailStatusRequest</p>
 */
public class GetTrailStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsOrganizationTrail")
    private Boolean isOrganizationTrail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>Specifies whether to query the status of a multi-account trail. Valid values:</p>
         * <ul>
         * <li>true: Query the status of a multi-account trail.</li>
         * <li>false: Query the status of a single-account trail. It is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isOrganizationTrail(Boolean isOrganizationTrail) {
            this.putQueryParameter("IsOrganizationTrail", isOrganizationTrail);
            this.isOrganizationTrail = isOrganizationTrail;
            return this;
        }

        /**
         * <p>The name of the trail.</p>
         * <p>The name must be 6 to 36 characters in length. The name must start with a lowercase letter and can contain lowercase letters, digits, hyphens (-), and underscores (_).</p>
         * <blockquote>
         * <p>The name must be unique within your Alibaba Cloud account.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>trail-test</p>
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
