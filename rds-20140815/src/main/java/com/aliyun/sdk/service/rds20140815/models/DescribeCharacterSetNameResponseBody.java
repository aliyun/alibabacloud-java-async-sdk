// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeCharacterSetNameResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCharacterSetNameResponseBody</p>
 */
public class DescribeCharacterSetNameResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CharacterSetNameItems")
    private CharacterSetNameItems characterSetNameItems;

    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCharacterSetNameResponseBody(Builder builder) {
        this.characterSetNameItems = builder.characterSetNameItems;
        this.engine = builder.engine;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCharacterSetNameResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return characterSetNameItems
     */
    public CharacterSetNameItems getCharacterSetNameItems() {
        return this.characterSetNameItems;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CharacterSetNameItems characterSetNameItems; 
        private String engine; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeCharacterSetNameResponseBody model) {
            this.characterSetNameItems = model.characterSetNameItems;
            this.engine = model.engine;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The character sets that are supported.</p>
         */
        public Builder characterSetNameItems(CharacterSetNameItems characterSetNameItems) {
            this.characterSetNameItems = characterSetNameItems;
            return this;
        }

        /**
         * <p>The type of the database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1E43AAE0-BEE8-43DA-860D-EAF2AA0724DC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCharacterSetNameResponseBody build() {
            return new DescribeCharacterSetNameResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCharacterSetNameResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCharacterSetNameResponseBody</p>
     */
    public static class CharacterSetNameItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CharacterSetName")
        private java.util.List<String> characterSetName;

        private CharacterSetNameItems(Builder builder) {
            this.characterSetName = builder.characterSetName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CharacterSetNameItems create() {
            return builder().build();
        }

        /**
         * @return characterSetName
         */
        public java.util.List<String> getCharacterSetName() {
            return this.characterSetName;
        }

        public static final class Builder {
            private java.util.List<String> characterSetName; 

            private Builder() {
            } 

            private Builder(CharacterSetNameItems model) {
                this.characterSetName = model.characterSetName;
            } 

            /**
             * CharacterSetName.
             */
            public Builder characterSetName(java.util.List<String> characterSetName) {
                this.characterSetName = characterSetName;
                return this;
            }

            public CharacterSetNameItems build() {
                return new CharacterSetNameItems(this);
            } 

        } 

    }
}
