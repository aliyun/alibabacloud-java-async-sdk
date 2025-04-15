// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link PAL7ConfigReplaceRule} extends {@link TeaModel}
 *
 * <p>PAL7ConfigReplaceRule</p>
 */
public class PAL7ConfigReplaceRule extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("From")
    private String from;

    @com.aliyun.core.annotation.NameInMap("To")
    private String to;

    private PAL7ConfigReplaceRule(Builder builder) {
        this.from = builder.from;
        this.to = builder.to;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PAL7ConfigReplaceRule create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return to
     */
    public String getTo() {
        return this.to;
    }

    public static final class Builder {
        private String from; 
        private String to; 

        private Builder() {
        } 

        private Builder(PAL7ConfigReplaceRule model) {
            this.from = model.from;
            this.to = model.to;
        } 

        /**
         * From.
         */
        public Builder from(String from) {
            this.from = from;
            return this;
        }

        /**
         * To.
         */
        public Builder to(String to) {
            this.to = to;
            return this;
        }

        public PAL7ConfigReplaceRule build() {
            return new PAL7ConfigReplaceRule(this);
        } 

    } 

}
