// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link MultilingualContentEntry} extends {@link TeaModel}
 *
 * <p>MultilingualContentEntry</p>
 */
public class MultilingualContentEntry extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Caption")
    private String caption;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    private MultilingualContentEntry(Builder builder) {
        this.caption = builder.caption;
        this.description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MultilingualContentEntry create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return caption
     */
    public String getCaption() {
        return this.caption;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    public static final class Builder {
        private String caption; 
        private String description; 

        private Builder() {
        } 

        private Builder(MultilingualContentEntry model) {
            this.caption = model.caption;
            this.description = model.description;
        } 

        /**
         * <p>The multilingual brief description.</p>
         * 
         * <strong>example:</strong>
         * <p>No personnel activity at the office desk</p>
         */
        public Builder caption(String caption) {
            this.caption = caption;
            return this;
        }

        /**
         * <p>The multilingual detailed description.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a close-up shot of an office desk setup. In the left foreground stands a tall, cylindrical, off-white insulated tumbler. A rectangular black mousepad occupies the center of the desk, holding a black backlit mechanical keyboard. Directly behind the keyboard sits a computer monitor with its screen illuminated, displaying the operating system\&quot;s application dock at the bottom. To the front right of the monitor stands a red metal beverage can, surrounded by a tangle of white data cables and a charging adapter. A small, silver, rectangular device (possibly a USB drive or an adapter) rests in the gap behind the left side of the keyboard, and a tiny pink decorative object is faintly visible on the desk surface. The scene is devoid of human activity; all objects remain motionless.</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public MultilingualContentEntry build() {
            return new MultilingualContentEntry(this);
        } 

    } 

}
