// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link Taint} extends {@link TeaModel}
 *
 * <p>Taint</p>
 */
public class Taint extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("effect")
    private String effect;

    @com.aliyun.core.annotation.NameInMap("key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    private Taint(Builder builder) {
        this.effect = builder.effect;
        this.key = builder.key;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Taint create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return effect
     */
    public String getEffect() {
        return this.effect;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String effect; 
        private String key; 
        private String value; 

        private Builder() {
        } 

        private Builder(Taint model) {
            this.effect = model.effect;
            this.key = model.key;
            this.value = model.value;
        } 

        /**
         * <p>The scheduling policy. Valid values:</p>
         * <ul>
         * <li><p><code>NoSchedule</code>: Not tolerated. This affects only the scheduling process. Already scheduled pods are not affected. This applies only to newly added pods.</p>
         * </li>
         * <li><p><code>NoExecute</code>: Not tolerated. When the taint changes, the pod is evicted.</p>
         * </li>
         * <li><p><code>PreferNoSchedule</code>: Soft constraint. Existing pods on the node are not affected. The scheduler tries to avoid scheduling pods that do not tolerate the taint to the node.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>NoSchedule</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>NoSchedule</p>
         */
        public Builder effect(String effect) {
            this.effect = effect;
            return this;
        }

        /**
         * <p>The key of the taint.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>The value of the taint.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public Taint build() {
            return new Taint(this);
        } 

    } 

}
