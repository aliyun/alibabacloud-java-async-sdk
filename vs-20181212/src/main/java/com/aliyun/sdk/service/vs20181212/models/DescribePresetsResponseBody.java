// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link DescribePresetsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePresetsResponseBody</p>
 */
public class DescribePresetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("Presets")
    private java.util.List<Presets> presets;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePresetsResponseBody(Builder builder) {
        this.id = builder.id;
        this.presets = builder.presets;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePresetsResponseBody create() {
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
     * @return presets
     */
    public java.util.List<Presets> getPresets() {
        return this.presets;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String id; 
        private java.util.List<Presets> presets; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribePresetsResponseBody model) {
            this.id = model.id;
            this.presets = model.presets;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Device ID.</p>
         * 
         * <strong>example:</strong>
         * <p>348*****380-cn-qingdao</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>List of presets.</p>
         */
        public Builder presets(java.util.List<Presets> presets) {
            this.presets = presets;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9FE0CA83-BFD3-4EBD-A429-FABB9B9AE772</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePresetsResponseBody build() {
            return new DescribePresetsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePresetsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePresetsResponseBody</p>
     */
    public static class Presets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Presets(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Presets create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(Presets model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * <p>Preset ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Preset name.</p>
             * 
             * <strong>example:</strong>
             * <p>预置位2</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Presets build() {
                return new Presets(this);
            } 

        } 

    }
}
