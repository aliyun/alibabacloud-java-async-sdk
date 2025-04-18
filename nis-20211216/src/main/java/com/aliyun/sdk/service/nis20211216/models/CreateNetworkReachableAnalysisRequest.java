// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

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
 * {@link CreateNetworkReachableAnalysisRequest} extends {@link RequestModel}
 *
 * <p>CreateNetworkReachableAnalysisRequest</p>
 */
public class CreateNetworkReachableAnalysisRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkPathId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkPathId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

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
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateNetworkReachableAnalysisRequest, Builder> {
        private String networkPathId; 
        private String regionId; 
        private java.util.List<Tag> tag; 

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
         * <p>The ID of the network path. You can call the <a href="https://help.aliyun.com/document_detail/2366522.html">CreateNetworkPath</a> operation to obtain the ID of the network path.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>np-b2f618ceb2c84057****</p>
         */
        public Builder networkPathId(String networkPathId) {
            this.putQueryParameter("NetworkPathId", networkPathId);
            this.networkPathId = networkPathId;
            return this;
        }

        /**
         * <p>The ID of the region for which you want to create a task for analyzing network reachability.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The tags to add to the resource.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateNetworkReachableAnalysisRequest build() {
            return new CreateNetworkReachableAnalysisRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateNetworkReachableAnalysisRequest} extends {@link TeaModel}
     *
     * <p>CreateNetworkReachableAnalysisRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the tag to add to the resource. The tag key can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
             * <p>You can add up to 20 tags in each call.</p>
             * 
             * <strong>example:</strong>
             * <p>Team</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag to add to the resource. The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag value cannot start with <code>acs:</code> or <code>aliyun</code>. The tag value can be an empty string.</p>
             * <p>You can add up to 20 tag values in each call.</p>
             * 
             * <strong>example:</strong>
             * <p>ops</p>
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
