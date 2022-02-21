// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSubscriptionMetaRequest} extends {@link RequestModel}
 *
 * <p>DescribeSubscriptionMetaRequest</p>
 */
public class DescribeSubscriptionMetaRequest extends Request {
    @Query
    @NameInMap("DtsInstanceId")
    private String dtsInstanceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Sid")
    @Validation(required = true)
    private String sid;

    @Query
    @NameInMap("SubMigrationJobIds")
    private java.util.Map < String, ? > subMigrationJobIds;

    @Query
    @NameInMap("Topics")
    private java.util.Map < String, ? > topics;

    private DescribeSubscriptionMetaRequest(Builder builder) {
        super(builder);
        this.dtsInstanceId = builder.dtsInstanceId;
        this.regionId = builder.regionId;
        this.sid = builder.sid;
        this.subMigrationJobIds = builder.subMigrationJobIds;
        this.topics = builder.topics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSubscriptionMetaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dtsInstanceId
     */
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sid
     */
    public String getSid() {
        return this.sid;
    }

    /**
     * @return subMigrationJobIds
     */
    public java.util.Map < String, ? > getSubMigrationJobIds() {
        return this.subMigrationJobIds;
    }

    /**
     * @return topics
     */
    public java.util.Map < String, ? > getTopics() {
        return this.topics;
    }

    public static final class Builder extends Request.Builder<DescribeSubscriptionMetaRequest, Builder> {
        private String dtsInstanceId; 
        private String regionId; 
        private String sid; 
        private java.util.Map < String, ? > subMigrationJobIds; 
        private java.util.Map < String, ? > topics; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSubscriptionMetaRequest response) {
            super(response);
            this.dtsInstanceId = response.dtsInstanceId;
            this.regionId = response.regionId;
            this.sid = response.sid;
            this.subMigrationJobIds = response.subMigrationJobIds;
            this.topics = response.topics;
        } 

        /**
         * DtsInstanceId.
         */
        public Builder dtsInstanceId(String dtsInstanceId) {
            this.putQueryParameter("DtsInstanceId", dtsInstanceId);
            this.dtsInstanceId = dtsInstanceId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Sid.
         */
        public Builder sid(String sid) {
            this.putQueryParameter("Sid", sid);
            this.sid = sid;
            return this;
        }

        /**
         * SubMigrationJobIds.
         */
        public Builder subMigrationJobIds(java.util.Map < String, ? > subMigrationJobIds) {
            this.putQueryParameter("SubMigrationJobIds", subMigrationJobIds);
            this.subMigrationJobIds = subMigrationJobIds;
            return this;
        }

        /**
         * Topics.
         */
        public Builder topics(java.util.Map < String, ? > topics) {
            this.putQueryParameter("Topics", topics);
            this.topics = topics;
            return this;
        }

        @Override
        public DescribeSubscriptionMetaRequest build() {
            return new DescribeSubscriptionMetaRequest(this);
        } 

    } 

}
