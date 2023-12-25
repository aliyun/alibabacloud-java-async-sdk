// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSheetResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSheetResponseBody</p>
 */
public class CreateSheetResponseBody extends TeaModel {
    @NameInMap("id")
    private String id;

    @NameInMap("name")
    private String name;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("visibility")
    private String visibility;

    private CreateSheetResponseBody(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.visibility = builder.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSheetResponseBody create() {
        return builder().build();
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return visibility
     */
    public String getVisibility() {
        return this.visibility;
    }

    public static final class Builder {
        private String id; 
        private String name; 
        private String requestId; 
        private String visibility; 

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * visibility.
         */
        public Builder visibility(String visibility) {
            this.visibility = visibility;
            return this;
        }

        public CreateSheetResponseBody build() {
            return new CreateSheetResponseBody(this);
        } 

    } 

}
