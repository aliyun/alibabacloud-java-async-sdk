// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.objectdet20191230.models;

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
 * {@link DetectObjectFrame} extends {@link TeaModel}
 *
 * <p>DetectObjectFrame</p>
 */
public class DetectObjectFrame extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Elements")
    private java.util.List<DetectObjectElement> elements;

    @com.aliyun.core.annotation.NameInMap("Time")
    private Long time;

    private DetectObjectFrame(Builder builder) {
        this.elements = builder.elements;
        this.time = builder.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetectObjectFrame create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return elements
     */
    public java.util.List<DetectObjectElement> getElements() {
        return this.elements;
    }

    /**
     * @return time
     */
    public Long getTime() {
        return this.time;
    }

    public static final class Builder {
        private java.util.List<DetectObjectElement> elements; 
        private Long time; 

        private Builder() {
        } 

        private Builder(DetectObjectFrame model) {
            this.elements = model.elements;
            this.time = model.time;
        } 

        /**
         * Elements.
         */
        public Builder elements(java.util.List<DetectObjectElement> elements) {
            this.elements = elements;
            return this;
        }

        /**
         * Time.
         */
        public Builder time(Long time) {
            this.time = time;
            return this;
        }

        public DetectObjectFrame build() {
            return new DetectObjectFrame(this);
        } 

    } 

}
