// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeltaRequest} extends {@link RequestModel}
 *
 * <p>ListDeltaRequest</p>
 */
public class ListDeltaRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("cursor")
    private String cursor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("limit")
    private Integer limit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sync_root_id")
    private String syncRootId;

    private ListDeltaRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.cursor = builder.cursor;
        this.driveId = builder.driveId;
        this.limit = builder.limit;
        this.syncRootId = builder.syncRootId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeltaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return cursor
     */
    public String getCursor() {
        return this.cursor;
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return syncRootId
     */
    public String getSyncRootId() {
        return this.syncRootId;
    }

    public static final class Builder extends Request.Builder<ListDeltaRequest, Builder> {
        private String domainId; 
        private String cursor; 
        private String driveId; 
        private Integer limit; 
        private String syncRootId; 

        private Builder() {
            super();
        } 

        private Builder(ListDeltaRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.cursor = request.cursor;
            this.driveId = request.driveId;
            this.limit = request.limit;
            this.syncRootId = request.syncRootId;
        } 

        /**
         * domain_id.
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * The cursor of the incremental information.
         */
        public Builder cursor(String cursor) {
            this.putBodyParameter("cursor", cursor);
            this.cursor = cursor;
            return this;
        }

        /**
         * The drive ID.
         */
        public Builder driveId(String driveId) {
            this.putBodyParameter("drive_id", driveId);
            this.driveId = driveId;
            return this;
        }

        /**
         * The maximum number of results to return. Valid values: 0 to 100. Default value: 100.
         * <p>
         * 
         * The number of returned results must be less than or equal to the specified number.
         */
        public Builder limit(Integer limit) {
            this.putBodyParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * The ID of the root file of the synced folder.
         */
        public Builder syncRootId(String syncRootId) {
            this.putBodyParameter("sync_root_id", syncRootId);
            this.syncRootId = syncRootId;
            return this;
        }

        @Override
        public ListDeltaRequest build() {
            return new ListDeltaRequest(this);
        } 

    } 

}
