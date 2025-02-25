// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.umeng_push20220225.models;

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
 * {@link HarmonyPayload} extends {@link TeaModel}
 *
 * <p>HarmonyPayload</p>
 */
public class HarmonyPayload extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("displayType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String displayType;

    @com.aliyun.core.annotation.NameInMap("extra")
    private java.util.Map<String, ?> extra;

    @com.aliyun.core.annotation.NameInMap("harmonyBody")
    private HarmonyBody harmonyBody;

    private HarmonyPayload(Builder builder) {
        this.displayType = builder.displayType;
        this.extra = builder.extra;
        this.harmonyBody = builder.harmonyBody;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HarmonyPayload create() {
        return builder().build();
    }

    /**
     * @return displayType
     */
    public String getDisplayType() {
        return this.displayType;
    }

    /**
     * @return extra
     */
    public java.util.Map<String, ?> getExtra() {
        return this.extra;
    }

    /**
     * @return harmonyBody
     */
    public HarmonyBody getHarmonyBody() {
        return this.harmonyBody;
    }

    public static final class Builder {
        private String displayType; 
        private java.util.Map<String, ?> extra; 
        private HarmonyBody harmonyBody; 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder displayType(String displayType) {
            this.displayType = displayType;
            return this;
        }

        /**
         * extra.
         */
        public Builder extra(java.util.Map<String, ?> extra) {
            this.extra = extra;
            return this;
        }

        /**
         * harmonyBody.
         */
        public Builder harmonyBody(HarmonyBody harmonyBody) {
            this.harmonyBody = harmonyBody;
            return this;
        }

        public HarmonyPayload build() {
            return new HarmonyPayload(this);
        } 

    } 

}
