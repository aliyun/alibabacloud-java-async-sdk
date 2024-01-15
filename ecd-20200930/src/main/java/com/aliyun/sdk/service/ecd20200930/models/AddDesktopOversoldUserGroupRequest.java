// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDesktopOversoldUserGroupRequest} extends {@link RequestModel}
 *
 * <p>AddDesktopOversoldUserGroupRequest</p>
 */
public class AddDesktopOversoldUserGroupRequest extends Request {
    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("OversoldGroupId")
    private String oversoldGroupId;

    @Query
    @NameInMap("PolicyGroupId")
    private String policyGroupId;

    private AddDesktopOversoldUserGroupRequest(Builder builder) {
        super(builder);
        this.imageId = builder.imageId;
        this.name = builder.name;
        this.oversoldGroupId = builder.oversoldGroupId;
        this.policyGroupId = builder.policyGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDesktopOversoldUserGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return oversoldGroupId
     */
    public String getOversoldGroupId() {
        return this.oversoldGroupId;
    }

    /**
     * @return policyGroupId
     */
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public static final class Builder extends Request.Builder<AddDesktopOversoldUserGroupRequest, Builder> {
        private String imageId; 
        private String name; 
        private String oversoldGroupId; 
        private String policyGroupId; 

        private Builder() {
            super();
        } 

        private Builder(AddDesktopOversoldUserGroupRequest request) {
            super(request);
            this.imageId = request.imageId;
            this.name = request.name;
            this.oversoldGroupId = request.oversoldGroupId;
            this.policyGroupId = request.policyGroupId;
        } 

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OversoldGroupId.
         */
        public Builder oversoldGroupId(String oversoldGroupId) {
            this.putQueryParameter("OversoldGroupId", oversoldGroupId);
            this.oversoldGroupId = oversoldGroupId;
            return this;
        }

        /**
         * PolicyGroupId.
         */
        public Builder policyGroupId(String policyGroupId) {
            this.putQueryParameter("PolicyGroupId", policyGroupId);
            this.policyGroupId = policyGroupId;
            return this;
        }

        @Override
        public AddDesktopOversoldUserGroupRequest build() {
            return new AddDesktopOversoldUserGroupRequest(this);
        } 

    } 

}
