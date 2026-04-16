// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link DataZoneSupportCompactionServiceValue} extends {@link TeaModel}
 *
 * <p>DataZoneSupportCompactionServiceValue</p>
 */
public class DataZoneSupportCompactionServiceValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("zoneId")
    private String zoneId;

    @com.aliyun.core.annotation.NameInMap("resourceLevel")
    private String resourceLevel;

    @com.aliyun.core.annotation.NameInMap("recommended")
    private Boolean recommended;

    private DataZoneSupportCompactionServiceValue(Builder builder) {
        this.zoneId = builder.zoneId;
        this.resourceLevel = builder.resourceLevel;
        this.recommended = builder.recommended;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataZoneSupportCompactionServiceValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return resourceLevel
     */
    public String getResourceLevel() {
        return this.resourceLevel;
    }

    /**
     * @return recommended
     */
    public Boolean getRecommended() {
        return this.recommended;
    }

    public static final class Builder {
        private String zoneId; 
        private String resourceLevel; 
        private Boolean recommended; 

        private Builder() {
        } 

        private Builder(DataZoneSupportCompactionServiceValue model) {
            this.zoneId = model.zoneId;
            this.resourceLevel = model.resourceLevel;
            this.recommended = model.recommended;
        } 

        /**
         * zoneId.
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        /**
         * resourceLevel.
         */
        public Builder resourceLevel(String resourceLevel) {
            this.resourceLevel = resourceLevel;
            return this;
        }

        /**
         * recommended.
         */
        public Builder recommended(Boolean recommended) {
            this.recommended = recommended;
            return this;
        }

        public DataZoneSupportCompactionServiceValue build() {
            return new DataZoneSupportCompactionServiceValue(this);
        } 

    } 

}
