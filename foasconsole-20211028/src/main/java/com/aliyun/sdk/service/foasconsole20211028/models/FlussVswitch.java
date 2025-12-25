// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20211028.models;

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
 * {@link FlussVswitch} extends {@link TeaModel}
 *
 * <p>FlussVswitch</p>
 */
public class FlussVswitch extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("VSwitchIds")
    private java.util.List<String> vSwitchIds;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private FlussVswitch(Builder builder) {
        this.vSwitchIds = builder.vSwitchIds;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FlussVswitch create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return vSwitchIds
     */
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder {
        private java.util.List<String> vSwitchIds; 
        private String zoneId; 

        private Builder() {
        } 

        private Builder(FlussVswitch model) {
            this.vSwitchIds = model.vSwitchIds;
            this.zoneId = model.zoneId;
        } 

        /**
         * VSwitchIds.
         */
        public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public FlussVswitch build() {
            return new FlussVswitch(this);
        } 

    } 

}
