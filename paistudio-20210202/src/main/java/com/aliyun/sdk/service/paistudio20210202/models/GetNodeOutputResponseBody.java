// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20210202.models;

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
 * {@link GetNodeOutputResponseBody} extends {@link TeaModel}
 *
 * <p>GetNodeOutputResponseBody</p>
 */
public class GetNodeOutputResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlgoName")
    private String algoName;

    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("LocationType")
    private String locationType;

    @com.aliyun.core.annotation.NameInMap("NodeName")
    private String nodeName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("Value")
    private java.util.Map<String, ?> value;

    private GetNodeOutputResponseBody(Builder builder) {
        this.algoName = builder.algoName;
        this.displayName = builder.displayName;
        this.locationType = builder.locationType;
        this.nodeName = builder.nodeName;
        this.requestId = builder.requestId;
        this.type = builder.type;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNodeOutputResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algoName
     */
    public String getAlgoName() {
        return this.algoName;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return locationType
     */
    public String getLocationType() {
        return this.locationType;
    }

    /**
     * @return nodeName
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return value
     */
    public java.util.Map<String, ?> getValue() {
        return this.value;
    }

    public static final class Builder {
        private String algoName; 
        private String displayName; 
        private String locationType; 
        private String nodeName; 
        private String requestId; 
        private String type; 
        private java.util.Map<String, ?> value; 

        private Builder() {
        } 

        private Builder(GetNodeOutputResponseBody model) {
            this.algoName = model.algoName;
            this.displayName = model.displayName;
            this.locationType = model.locationType;
            this.nodeName = model.nodeName;
            this.requestId = model.requestId;
            this.type = model.type;
            this.value = model.value;
        } 

        /**
         * AlgoName.
         */
        public Builder algoName(String algoName) {
            this.algoName = algoName;
            return this;
        }

        /**
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * LocationType.
         */
        public Builder locationType(String locationType) {
            this.locationType = locationType;
            return this;
        }

        /**
         * NodeName.
         */
        public Builder nodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * Value.
         */
        public Builder value(java.util.Map<String, ?> value) {
            this.value = value;
            return this;
        }

        public GetNodeOutputResponseBody build() {
            return new GetNodeOutputResponseBody(this);
        } 

    } 

}
