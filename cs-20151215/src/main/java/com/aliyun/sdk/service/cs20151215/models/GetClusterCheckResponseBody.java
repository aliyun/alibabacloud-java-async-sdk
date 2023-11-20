// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClusterCheckResponseBody} extends {@link TeaModel}
 *
 * <p>GetClusterCheckResponseBody</p>
 */
public class GetClusterCheckResponseBody extends TeaModel {
    @NameInMap("check_id")
    private String checkId;

    @NameInMap("check_items")
    private java.util.Map < String, java.util.List<java.util.Map<String, ?>>> checkItems;

    @NameInMap("created_at")
    private String createdAt;

    @NameInMap("finished_at")
    private String finishedAt;

    @NameInMap("message")
    private String message;

    @NameInMap("status")
    private String status;

    @NameInMap("type")
    private String type;

    private GetClusterCheckResponseBody(Builder builder) {
        this.checkId = builder.checkId;
        this.checkItems = builder.checkItems;
        this.createdAt = builder.createdAt;
        this.finishedAt = builder.finishedAt;
        this.message = builder.message;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterCheckResponseBody create() {
        return builder().build();
    }

    /**
     * @return checkId
     */
    public String getCheckId() {
        return this.checkId;
    }

    /**
     * @return checkItems
     */
    public java.util.Map < String, java.util.List<java.util.Map<String, ?>>> getCheckItems() {
        return this.checkItems;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return finishedAt
     */
    public String getFinishedAt() {
        return this.finishedAt;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String checkId; 
        private java.util.Map < String, java.util.List<java.util.Map<String, ?>>> checkItems; 
        private String createdAt; 
        private String finishedAt; 
        private String message; 
        private String status; 
        private String type; 

        /**
         * Id of the request
         */
        public Builder checkId(String checkId) {
            this.checkId = checkId;
            return this;
        }

        /**
         * check_items.
         */
        public Builder checkItems(java.util.Map < String, java.util.List<java.util.Map<String, ?>>> checkItems) {
            this.checkItems = checkItems;
            return this;
        }

        /**
         * created_at.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * finished_at.
         */
        public Builder finishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public GetClusterCheckResponseBody build() {
            return new GetClusterCheckResponseBody(this);
        } 

    } 

}
