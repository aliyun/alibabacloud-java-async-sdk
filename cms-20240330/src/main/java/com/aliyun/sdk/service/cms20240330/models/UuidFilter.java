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
 * {@link UuidFilter} extends {@link TeaModel}
 *
 * <p>UuidFilter</p>
 */
public class UuidFilter extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("eq")
    private String eq;

    @com.aliyun.core.annotation.NameInMap("in")
    private java.util.List<String> in;

    private UuidFilter(Builder builder) {
        this.eq = builder.eq;
        this.in = builder.in;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UuidFilter create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eq
     */
    public String getEq() {
        return this.eq;
    }

    /**
     * @return in
     */
    public java.util.List<String> getIn() {
        return this.in;
    }

    public static final class Builder {
        private String eq; 
        private java.util.List<String> in; 

        private Builder() {
        } 

        private Builder(UuidFilter model) {
            this.eq = model.eq;
            this.in = model.in;
        } 

        /**
         * <p>The exact match condition for the alert rule UUID. Only the alert rule whose UUID equals the specified value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>a1b2c3d4-e5f6-7890-abcd-ef1234567890</p>
         */
        public Builder eq(String eq) {
            this.eq = eq;
            return this;
        }

        /**
         * <p>The set match condition for alert rule UUIDs. All alert rules whose UUIDs are in the specified list are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;a1b2c3d4-e5f6-7890-abcd-ef1234567890&quot;,&quot;b2c3d4e5-f6a7-8901-bcde-f12345678901&quot;]</p>
         */
        public Builder in(java.util.List<String> in) {
            this.in = in;
            return this;
        }

        public UuidFilter build() {
            return new UuidFilter(this);
        } 

    } 

}
