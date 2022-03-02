// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link JSONInput} extends {@link TeaModel}
 *
 * <p>JSONInput</p>
 */
public class JSONInput extends TeaModel {
    @NameInMap("ParseJsonNumberAsString")
    private Boolean parseJsonNumberAsString;

    @NameInMap("Range")
    private String range;

    @NameInMap("Type")
    private String type;

    private JSONInput(Builder builder) {
        this.parseJsonNumberAsString = builder.parseJsonNumberAsString;
        this.range = builder.range;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JSONInput create() {
        return builder().build();
    }

    /**
     * @return parseJsonNumberAsString
     */
    public Boolean getParseJsonNumberAsString() {
        return this.parseJsonNumberAsString;
    }

    /**
     * @return range
     */
    public String getRange() {
        return this.range;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Boolean parseJsonNumberAsString; 
        private String range; 
        private String type; 

        /**
         * description
         */
        public Builder parseJsonNumberAsString(Boolean parseJsonNumberAsString) {
            this.parseJsonNumberAsString = parseJsonNumberAsString;
            return this;
        }

        /**
         * description
         */
        public Builder range(String range) {
            this.range = range;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(JSONType type) {
            this.type = type.getValue();
            return this;
        }

        public JSONInput build() {
            return new JSONInput(this);
        } 

    } 

}
