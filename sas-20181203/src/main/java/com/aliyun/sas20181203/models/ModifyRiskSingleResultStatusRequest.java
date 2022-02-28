// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyRiskSingleResultStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyRiskSingleResultStatusRequest</p>
 */
public class ModifyRiskSingleResultStatusRequest extends Request {
    @Query
    @NameInMap("Ids")
    private java.util.List < String > ids;

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
    private String status;

    @Query
    @NameInMap("TaskId")
    private Long taskId;

    private ModifyRiskSingleResultStatusRequest(Builder builder) {
        super(builder);
        this.ids = builder.ids;
        this.lang = builder.lang;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceIp = builder.sourceIp;
        this.status = builder.status;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRiskSingleResultStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ids
     */
    public java.util.List < String > getIds() {
        return this.ids;
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

    public static final class Builder extends Request.Builder<ModifyRiskSingleResultStatusRequest, Builder> {
        private java.util.List < String > ids; 
        private String lang; 
        private Long resourceOwnerId; 
        private String sourceIp; 
        private String status; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyRiskSingleResultStatusRequest response) {
            super(response);
            this.ids = response.ids;
            this.lang = response.lang;
            this.resourceOwnerId = response.resourceOwnerId;
            this.sourceIp = response.sourceIp;
            this.status = response.status;
            this.taskId = response.taskId;
        } 

        /**
         * Ids.
         */
        public Builder ids(java.util.List < String > ids) {
            this.putQueryParameter("Ids", ids);
            this.ids = ids;
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
        public ModifyRiskSingleResultStatusRequest build() {
            return new ModifyRiskSingleResultStatusRequest(this);
        } 

    } 

}
