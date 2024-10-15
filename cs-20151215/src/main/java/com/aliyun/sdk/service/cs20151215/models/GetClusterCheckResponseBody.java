// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetClusterCheckResponseBody} extends {@link TeaModel}
 *
 * <p>GetClusterCheckResponseBody</p>
 */
public class GetClusterCheckResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("check_id")
    private String checkId;

    @com.aliyun.core.annotation.NameInMap("check_items")
    private java.util.Map < String, java.util.List<java.util.Map<String, ?>>> checkItems;

    @com.aliyun.core.annotation.NameInMap("created_at")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("finished_at")
    private String finishedAt;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("type")
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>1697100584236600453-ce0da5a1d627e4e9e9f96cae8ad07****-clustercheck-lboto</p>
         */
        public Builder checkId(String checkId) {
            this.checkId = checkId;
            return this;
        }

        /**
         * <p>The list of check items.</p>
         */
        public Builder checkItems(java.util.Map < String, java.util.List<java.util.Map<String, ?>>> checkItems) {
            this.checkItems = checkItems;
            return this;
        }

        /**
         * <p>The time when the cluster check task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-16T08:31:20.292030178Z</p>
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * <p>The time when the cluster check task was completed.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-16T08:35:20.292030178Z</p>
         */
        public Builder finishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }

        /**
         * <p>The message that indicates the status of the cluster check task.</p>
         * 
         * <strong>example:</strong>
         * <p>task succeed</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The status of the cluster check.</p>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The check method.</p>
         * 
         * <strong>example:</strong>
         * <p>ClusterUpgrade</p>
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
