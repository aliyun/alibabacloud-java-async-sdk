// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFoundationComponentVersionsRequest} extends {@link RequestModel}
 *
 * <p>ListFoundationComponentVersionsRequest</p>
 */
public class ListFoundationComponentVersionsRequest extends Request {
    @Path
    @NameInMap("uid")
    private String uid;

    @Query
    @NameInMap("onlyEnabled")
    private Boolean onlyEnabled;

    @Query
    @NameInMap("parentComponentRelationUID")
    private String parentComponentRelationUID;

    private ListFoundationComponentVersionsRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.onlyEnabled = builder.onlyEnabled;
        this.parentComponentRelationUID = builder.parentComponentRelationUID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFoundationComponentVersionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return onlyEnabled
     */
    public Boolean getOnlyEnabled() {
        return this.onlyEnabled;
    }

    /**
     * @return parentComponentRelationUID
     */
    public String getParentComponentRelationUID() {
        return this.parentComponentRelationUID;
    }

    public static final class Builder extends Request.Builder<ListFoundationComponentVersionsRequest, Builder> {
        private String uid; 
        private Boolean onlyEnabled; 
        private String parentComponentRelationUID; 

        private Builder() {
            super();
        } 

        private Builder(ListFoundationComponentVersionsRequest request) {
            super(request);
            this.uid = request.uid;
            this.onlyEnabled = request.onlyEnabled;
            this.parentComponentRelationUID = request.parentComponentRelationUID;
        } 

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * onlyEnabled.
         */
        public Builder onlyEnabled(Boolean onlyEnabled) {
            this.putQueryParameter("onlyEnabled", onlyEnabled);
            this.onlyEnabled = onlyEnabled;
            return this;
        }

        /**
         * parentComponentRelationUID.
         */
        public Builder parentComponentRelationUID(String parentComponentRelationUID) {
            this.putQueryParameter("parentComponentRelationUID", parentComponentRelationUID);
            this.parentComponentRelationUID = parentComponentRelationUID;
            return this;
        }

        @Override
        public ListFoundationComponentVersionsRequest build() {
            return new ListFoundationComponentVersionsRequest(this);
        } 

    } 

}
