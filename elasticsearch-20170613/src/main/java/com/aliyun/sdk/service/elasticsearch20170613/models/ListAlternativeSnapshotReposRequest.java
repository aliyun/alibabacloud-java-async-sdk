// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link ListAlternativeSnapshotReposRequest} extends {@link RequestModel}
 *
 * <p>ListAlternativeSnapshotReposRequest</p>
 */
public class ListAlternativeSnapshotReposRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("alreadySetItems")
    private Boolean alreadySetItems;

    private ListAlternativeSnapshotReposRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.alreadySetItems = builder.alreadySetItems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlternativeSnapshotReposRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return alreadySetItems
     */
    public Boolean getAlreadySetItems() {
        return this.alreadySetItems;
    }

    public static final class Builder extends Request.Builder<ListAlternativeSnapshotReposRequest, Builder> {
        private String instanceId; 
        private Boolean alreadySetItems; 

        private Builder() {
            super();
        } 

        private Builder(ListAlternativeSnapshotReposRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.alreadySetItems = request.alreadySetItems;
        } 

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-0pp1jxvcl000z****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Indicates whether to return the OSS reference repository added. The return value. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder alreadySetItems(Boolean alreadySetItems) {
            this.putQueryParameter("alreadySetItems", alreadySetItems);
            this.alreadySetItems = alreadySetItems;
            return this;
        }

        @Override
        public ListAlternativeSnapshotReposRequest build() {
            return new ListAlternativeSnapshotReposRequest(this);
        } 

    } 

}
