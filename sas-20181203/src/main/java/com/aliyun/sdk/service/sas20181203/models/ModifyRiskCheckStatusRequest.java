// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyRiskCheckStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyRiskCheckStatusRequest</p>
 */
public class ModifyRiskCheckStatusRequest extends Request {
    @Query
    @NameInMap("ItemId")
    @Validation(required = true)
    private Long itemId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Status")
    @Validation(required = true)
    private String status;

    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private Long taskId;

    private ModifyRiskCheckStatusRequest(Builder builder) {
        super(builder);
        this.itemId = builder.itemId;
        this.lang = builder.lang;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceIp = builder.sourceIp;
        this.status = builder.status;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRiskCheckStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return itemId
     */
    public Long getItemId() {
        return this.itemId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<ModifyRiskCheckStatusRequest, Builder> {
        private Long itemId; 
        private String lang; 
        private Long resourceOwnerId; 
        private String sourceIp; 
        private String status; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyRiskCheckStatusRequest request) {
            super(request);
            this.itemId = request.itemId;
            this.lang = request.lang;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sourceIp = request.sourceIp;
            this.status = request.status;
            this.taskId = request.taskId;
        } 

        /**
         * ItemId.
         */
        public Builder itemId(Long itemId) {
            this.putQueryParameter("ItemId", itemId);
            this.itemId = itemId;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public ModifyRiskCheckStatusRequest build() {
            return new ModifyRiskCheckStatusRequest(this);
        } 

    } 

}
