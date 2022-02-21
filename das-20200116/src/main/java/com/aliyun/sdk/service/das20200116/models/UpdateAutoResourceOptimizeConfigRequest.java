// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAutoResourceOptimizeConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateAutoResourceOptimizeConfigRequest</p>
 */
public class UpdateAutoResourceOptimizeConfigRequest extends Request {
    @Query
    @NameInMap("AccessKey")
    private String accessKey;

    @Query
    @NameInMap("AutoDefragment")
    private Integer autoDefragment;

    @Query
    @NameInMap("AutoDuplicateIndexDelete")
    private Integer autoDuplicateIndexDelete;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Signature")
    private String signature;

    @Query
    @NameInMap("TableFragmentationRatio")
    private Float tableFragmentationRatio;

    @Query
    @NameInMap("TableSpaceSize")
    private Float tableSpaceSize;

    @Query
    @NameInMap("Uid")
    private String uid;

    @Query
    @NameInMap("UserId")
    private String userId;

    @Query
    @NameInMap("__context")
    private String context;

    private UpdateAutoResourceOptimizeConfigRequest(Builder builder) {
        super(builder);
        this.accessKey = builder.accessKey;
        this.autoDefragment = builder.autoDefragment;
        this.autoDuplicateIndexDelete = builder.autoDuplicateIndexDelete;
        this.instanceId = builder.instanceId;
        this.signature = builder.signature;
        this.tableFragmentationRatio = builder.tableFragmentationRatio;
        this.tableSpaceSize = builder.tableSpaceSize;
        this.uid = builder.uid;
        this.userId = builder.userId;
        this.context = builder.context;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAutoResourceOptimizeConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessKey
     */
    public String getAccessKey() {
        return this.accessKey;
    }

    /**
     * @return autoDefragment
     */
    public Integer getAutoDefragment() {
        return this.autoDefragment;
    }

    /**
     * @return autoDuplicateIndexDelete
     */
    public Integer getAutoDuplicateIndexDelete() {
        return this.autoDuplicateIndexDelete;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return signature
     */
    public String getSignature() {
        return this.signature;
    }

    /**
     * @return tableFragmentationRatio
     */
    public Float getTableFragmentationRatio() {
        return this.tableFragmentationRatio;
    }

    /**
     * @return tableSpaceSize
     */
    public Float getTableSpaceSize() {
        return this.tableSpaceSize;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return context
     */
    public String getContext() {
        return this.context;
    }

    public static final class Builder extends Request.Builder<UpdateAutoResourceOptimizeConfigRequest, Builder> {
        private String accessKey; 
        private Integer autoDefragment; 
        private Integer autoDuplicateIndexDelete; 
        private String instanceId; 
        private String signature; 
        private Float tableFragmentationRatio; 
        private Float tableSpaceSize; 
        private String uid; 
        private String userId; 
        private String context; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAutoResourceOptimizeConfigRequest response) {
            super(response);
            this.accessKey = response.accessKey;
            this.autoDefragment = response.autoDefragment;
            this.autoDuplicateIndexDelete = response.autoDuplicateIndexDelete;
            this.instanceId = response.instanceId;
            this.signature = response.signature;
            this.tableFragmentationRatio = response.tableFragmentationRatio;
            this.tableSpaceSize = response.tableSpaceSize;
            this.uid = response.uid;
            this.userId = response.userId;
            this.context = response.context;
        } 

        /**
         * AccessKey.
         */
        public Builder accessKey(String accessKey) {
            this.putQueryParameter("AccessKey", accessKey);
            this.accessKey = accessKey;
            return this;
        }

        /**
         * AutoDefragment.
         */
        public Builder autoDefragment(Integer autoDefragment) {
            this.putQueryParameter("AutoDefragment", autoDefragment);
            this.autoDefragment = autoDefragment;
            return this;
        }

        /**
         * AutoDuplicateIndexDelete.
         */
        public Builder autoDuplicateIndexDelete(Integer autoDuplicateIndexDelete) {
            this.putQueryParameter("AutoDuplicateIndexDelete", autoDuplicateIndexDelete);
            this.autoDuplicateIndexDelete = autoDuplicateIndexDelete;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Signature.
         */
        public Builder signature(String signature) {
            this.putQueryParameter("Signature", signature);
            this.signature = signature;
            return this;
        }

        /**
         * TableFragmentationRatio.
         */
        public Builder tableFragmentationRatio(Float tableFragmentationRatio) {
            this.putQueryParameter("TableFragmentationRatio", tableFragmentationRatio);
            this.tableFragmentationRatio = tableFragmentationRatio;
            return this;
        }

        /**
         * TableSpaceSize.
         */
        public Builder tableSpaceSize(Float tableSpaceSize) {
            this.putQueryParameter("TableSpaceSize", tableSpaceSize);
            this.tableSpaceSize = tableSpaceSize;
            return this;
        }

        /**
         * Uid.
         */
        public Builder uid(String uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * __context.
         */
        public Builder context(String context) {
            this.putQueryParameter("__context", context);
            this.context = context;
            return this;
        }

        @Override
        public UpdateAutoResourceOptimizeConfigRequest build() {
            return new UpdateAutoResourceOptimizeConfigRequest(this);
        } 

    } 

}
