// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link PrivatePoolOptions} extends {@link TeaModel}
 *
 * <p>PrivatePoolOptions</p>
 */
public class PrivatePoolOptions extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MatchCriteria")
    private String matchCriteria;

    @com.aliyun.core.annotation.NameInMap("PrivatePoolIds")
    private java.util.List<String> privatePoolIds;

    private PrivatePoolOptions(Builder builder) {
        this.matchCriteria = builder.matchCriteria;
        this.privatePoolIds = builder.privatePoolIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PrivatePoolOptions create() {
        return builder().build();
    }

    /**
     * @return matchCriteria
     */
    public String getMatchCriteria() {
        return this.matchCriteria;
    }

    /**
     * @return privatePoolIds
     */
    public java.util.List<String> getPrivatePoolIds() {
        return this.privatePoolIds;
    }

    public static final class Builder {
        private String matchCriteria; 
        private java.util.List<String> privatePoolIds; 

        /**
         * MatchCriteria.
         */
        public Builder matchCriteria(String matchCriteria) {
            this.matchCriteria = matchCriteria;
            return this;
        }

        /**
         * PrivatePoolIds.
         */
        public Builder privatePoolIds(java.util.List<String> privatePoolIds) {
            this.privatePoolIds = privatePoolIds;
            return this;
        }

        public PrivatePoolOptions build() {
            return new PrivatePoolOptions(this);
        } 

    } 

}
