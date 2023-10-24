// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNetworkReachableAnalysisRequest} extends {@link RequestModel}
 *
 * <p>CreateNetworkReachableAnalysisRequest</p>
 */
public class CreateNetworkReachableAnalysisRequest extends Request {
    @Query
    @NameInMap("NetworkPathId")
    @Validation(required = true)
    private String networkPathId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    private CreateNetworkReachableAnalysisRequest(Builder builder) {
        super(builder);
        this.networkPathId = builder.networkPathId;
        this.regionId = builder.regionId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNetworkReachableAnalysisRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkPathId
     */
    public String getNetworkPathId() {
        return this.networkPathId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateNetworkReachableAnalysisRequest, Builder> {
        private String networkPathId; 
        private String regionId; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateNetworkReachableAnalysisRequest request) {
            super(request);
            this.networkPathId = request.networkPathId;
            this.regionId = request.regionId;
            this.tag = request.tag;
        } 

        /**
         * The ID of the network path. You can call the **CreateNetworkPath** operation to obtain the ID of the network path.
         */
        public Builder networkPathId(String networkPathId) {
            this.putQueryParameter("NetworkPathId", networkPathId);
            this.networkPathId = networkPathId;
            return this;
        }

        /**
         * The ID of the region for which you want to create a task for analyzing network reachability.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The tags to add to the resource.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateNetworkReachableAnalysisRequest build() {
            return new CreateNetworkReachableAnalysisRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key of tag N to add to the resource. The tag key can be up to 128 characters in length and cannot contain `http://` or `https://`. The tag key cannot start with `acs:` or `aliyun`.
             * <p>
             * 
             * You can add up to 20 tags in each call.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N to add to the resource. You can specify up to 20 tag values. The tag value can be an empty string.
             * <p>
             * 
             * The tag value can be up to 128 characters in length and cannot contain `http://` or `https://`. The tag value cannot start with `aliyun` or `acs:`.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
