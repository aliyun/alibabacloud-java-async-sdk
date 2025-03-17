// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link ModifyUserToDesktopGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyUserToDesktopGroupRequest</p>
 */
public class ModifyUserToDesktopGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String desktopGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewEndUserIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> newEndUserIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OldEndUserIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> oldEndUserIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ModifyUserToDesktopGroupRequest(Builder builder) {
        super(builder);
        this.desktopGroupId = builder.desktopGroupId;
        this.newEndUserIds = builder.newEndUserIds;
        this.oldEndUserIds = builder.oldEndUserIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyUserToDesktopGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopGroupId
     */
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    /**
     * @return newEndUserIds
     */
    public java.util.List<String> getNewEndUserIds() {
        return this.newEndUserIds;
    }

    /**
     * @return oldEndUserIds
     */
    public java.util.List<String> getOldEndUserIds() {
        return this.oldEndUserIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyUserToDesktopGroupRequest, Builder> {
        private String desktopGroupId; 
        private java.util.List<String> newEndUserIds; 
        private java.util.List<String> oldEndUserIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyUserToDesktopGroupRequest request) {
            super(request);
            this.desktopGroupId = request.desktopGroupId;
            this.newEndUserIds = request.newEndUserIds;
            this.oldEndUserIds = request.oldEndUserIds;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the cloud computer pool whose end users you want to change.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dg-2i8qxpv6t1a03****</p>
         */
        public Builder desktopGroupId(String desktopGroupId) {
            this.putQueryParameter("DesktopGroupId", desktopGroupId);
            this.desktopGroupId = desktopGroupId;
            return this;
        }

        /**
         * <p>The IDs of the end users that you want to add. You can configure 1 to 500 IDs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder newEndUserIds(java.util.List<String> newEndUserIds) {
            this.putQueryParameter("NewEndUserIds", newEndUserIds);
            this.newEndUserIds = newEndUserIds;
            return this;
        }

        /**
         * <p>The IDs of the end users that you want to remove. You can configure 1 to 500 IDs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder oldEndUserIds(java.util.List<String> oldEndUserIds) {
            this.putQueryParameter("OldEndUserIds", oldEndUserIds);
            this.oldEndUserIds = oldEndUserIds;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyUserToDesktopGroupRequest build() {
            return new ModifyUserToDesktopGroupRequest(this);
        } 

    } 

}
