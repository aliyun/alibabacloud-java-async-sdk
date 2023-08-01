// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link Chart} extends {@link TeaModel}
 *
 * <p>Chart</p>
 */
public class Chart extends TeaModel {
    @NameInMap("action")
    @Validation(required = true)
    private java.util.Map < String, ? > action;

    @NameInMap("display")
    @Validation(required = true)
    private java.util.Map < String, ? > display;

    @NameInMap("search")
    @Validation(required = true)
    private java.util.Map < String, ? > search;

    @NameInMap("title")
    @Validation(required = true)
    private String title;

    @NameInMap("type")
    @Validation(required = true)
    private String type;

    private Chart(Builder builder) {
        this.action = builder.action;
        this.display = builder.display;
        this.search = builder.search;
        this.title = builder.title;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Chart create() {
        return builder().build();
    }

    /**
     * @return action
     */
    public java.util.Map < String, ? > getAction() {
        return this.action;
    }

    /**
     * @return display
     */
    public java.util.Map < String, ? > getDisplay() {
        return this.display;
    }

    /**
     * @return search
     */
    public java.util.Map < String, ? > getSearch() {
        return this.search;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private java.util.Map < String, ? > action; 
        private java.util.Map < String, ? > display; 
        private java.util.Map < String, ? > search; 
        private String title; 
        private String type; 

        /**
         * action.
         */
        public Builder action(java.util.Map < String, ? > action) {
            this.action = action;
            return this;
        }

        /**
         * display.
         */
        public Builder display(java.util.Map < String, ? > display) {
            this.display = display;
            return this;
        }

        /**
         * search.
         */
        public Builder search(java.util.Map < String, ? > search) {
            this.search = search;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Chart build() {
            return new Chart(this);
        } 

    } 

}
