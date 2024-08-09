// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link JobInfo} extends {@link TeaModel}
 *
 * <p>JobInfo</p>
 */
public class JobInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("properties")
    private java.util.Map < String, ? > properties;

    private JobInfo(Builder builder) {
        this.id = builder.id;
        this.properties = builder.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JobInfo create() {
        return builder().build();
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return properties
     */
    public java.util.Map < String, ? > getProperties() {
        return this.properties;
    }

    public static final class Builder {
        private String id; 
        private java.util.Map < String, ? > properties; 

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * properties.
         */
        public Builder properties(java.util.Map < String, ? > properties) {
            this.properties = properties;
            return this;
        }

        public JobInfo build() {
            return new JobInfo(this);
        } 

    } 

}
