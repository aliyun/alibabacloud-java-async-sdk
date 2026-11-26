// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link MissionConnectorTarget} extends {@link TeaModel}
 *
 * <p>MissionConnectorTarget</p>
 */
public class MissionConnectorTarget extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("displayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("targetType")
    private String targetType;

    private MissionConnectorTarget(Builder builder) {
        this.displayName = builder.displayName;
        this.id = builder.id;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MissionConnectorTarget create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder {
        private String displayName; 
        private String id; 
        private String targetType; 

        private Builder() {
        } 

        private Builder(MissionConnectorTarget model) {
            this.displayName = model.displayName;
            this.id = model.id;
            this.targetType = model.targetType;
        } 

        /**
         * <p>The display name of the IM contact or group.</p>
         * 
         * <strong>example:</strong>
         * <p>Alert notification group</p>
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The case-sensitive ID of the IM contact or group.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The recipient type. Valid values: user for a user, and group for a group.</p>
         * 
         * <strong>example:</strong>
         * <p>group</p>
         */
        public Builder targetType(String targetType) {
            this.targetType = targetType;
            return this;
        }

        public MissionConnectorTarget build() {
            return new MissionConnectorTarget(this);
        } 

    } 

}
