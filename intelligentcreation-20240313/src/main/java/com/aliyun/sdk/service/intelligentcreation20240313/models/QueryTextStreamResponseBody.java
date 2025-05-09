// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link QueryTextStreamResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTextStreamResponseBody</p>
 */
public class QueryTextStreamResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("end")
    private Boolean end;

    @com.aliyun.core.annotation.NameInMap("index")
    private Integer index;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("type")
    private Integer type;

    private QueryTextStreamResponseBody(Builder builder) {
        this.end = builder.end;
        this.index = builder.index;
        this.message = builder.message;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTextStreamResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return end
     */
    public Boolean getEnd() {
        return this.end;
    }

    /**
     * @return index
     */
    public Integer getIndex() {
        return this.index;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder {
        private Boolean end; 
        private Integer index; 
        private String message; 
        private Integer type; 

        private Builder() {
        } 

        private Builder(QueryTextStreamResponseBody model) {
            this.end = model.end;
            this.index = model.index;
            this.message = model.message;
            this.type = model.type;
        } 

        /**
         * end.
         */
        public Builder end(Boolean end) {
            this.end = end;
            return this;
        }

        /**
         * index.
         */
        public Builder index(Integer index) {
            this.index = index;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * type.
         */
        public Builder type(Integer type) {
            this.type = type;
            return this;
        }

        public QueryTextStreamResponseBody build() {
            return new QueryTextStreamResponseBody(this);
        } 

    } 

}
