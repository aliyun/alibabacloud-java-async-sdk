// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119.models;

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
 * {@link EventMatchRule} extends {@link TeaModel}
 *
 * <p>EventMatchRule</p>
 */
public class EventMatchRule extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MatchState")
    private Boolean matchState;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Prefix")
    private String prefix;

    @com.aliyun.core.annotation.NameInMap("Suffix")
    private String suffix;

    private EventMatchRule(Builder builder) {
        this.matchState = builder.matchState;
        this.name = builder.name;
        this.prefix = builder.prefix;
        this.suffix = builder.suffix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EventMatchRule create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return matchState
     */
    public Boolean getMatchState() {
        return this.matchState;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * @return suffix
     */
    public String getSuffix() {
        return this.suffix;
    }

    public static final class Builder {
        private Boolean matchState; 
        private String name; 
        private String prefix; 
        private String suffix; 

        private Builder() {
        } 

        private Builder(EventMatchRule model) {
            this.matchState = model.matchState;
            this.name = model.name;
            this.prefix = model.prefix;
            this.suffix = model.suffix;
        } 

        /**
         * <p>Indicates whether the rule is matched.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder matchState(Boolean matchState) {
            this.matchState = matchState;
            return this;
        }

        /**
         * <p>The full name matching rule.</p>
         * 
         * <strong>example:</strong>
         * <p>testBucket/folder1/file1</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The prefix matching rule.</p>
         * 
         * <strong>example:</strong>
         * <p>testBucket/prefix1xxx</p>
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * <p>The suffix matching rule.</p>
         * 
         * <strong>example:</strong>
         * <p>suffix/xxxx.test</p>
         */
        public Builder suffix(String suffix) {
            this.suffix = suffix;
            return this;
        }

        public EventMatchRule build() {
            return new EventMatchRule(this);
        } 

    } 

}
