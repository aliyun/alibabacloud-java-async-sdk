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
 * {@link ObserveGroupPromInstance} extends {@link TeaModel}
 *
 * <p>ObserveGroupPromInstance</p>
 */
public class ObserveGroupPromInstance extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("kind")
    private String kind;

    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.NameInMap("time")
    private String time;

    private ObserveGroupPromInstance(Builder builder) {
        this.id = builder.id;
        this.kind = builder.kind;
        this.region = builder.region;
        this.time = builder.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ObserveGroupPromInstance create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return kind
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    public static final class Builder {
        private String id; 
        private String kind; 
        private String region; 
        private String time; 

        private Builder() {
        } 

        private Builder(ObserveGroupPromInstance model) {
            this.id = model.id;
            this.kind = model.kind;
            this.region = model.region;
            this.time = model.time;
        } 

        /**
         * <p>The ID of the Managed Service for Prometheus instance, such as rw-xxxxxxxxxx.</p>
         * 
         * <strong>example:</strong>
         * <p>prom-12345</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The source of the instance. Valid values:</p>
         * <ul>
         * <li>system: The system automatically identifies the instance based on the workspace or UModel.</li>
         * <li>custom: The user manually selects the instance in the console.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prometheus</p>
         */
        public Builder kind(String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * <p>The region where the Managed Service for Prometheus instance resides. If this parameter is left empty, the backend automatically populates the region based on the workspace to which the observation group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * <p>The time when the record was written or selected. Format: yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-15 10:30:00</p>
         */
        public Builder time(String time) {
            this.time = time;
            return this;
        }

        public ObserveGroupPromInstance build() {
            return new ObserveGroupPromInstance(this);
        } 

    } 

}
