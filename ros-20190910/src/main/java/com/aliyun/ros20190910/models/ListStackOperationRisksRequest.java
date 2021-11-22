// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListStackOperationRisksRequest} extends {@link RequestModel}
 *
 * <p>ListStackOperationRisksRequest</p>
 */
public class ListStackOperationRisksRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("OperationType")
    private String operationType;

    @Query
    @NameInMap("RamRoleName")
    private String ramRoleName;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RetainAllResources")
    private Boolean retainAllResources;

    @Query
    @NameInMap("RetainResources")
    private java.util.List < String > retainResources;

    @Query
    @NameInMap("StackId")
    private String stackId;


    private ListStackOperationRisksRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.operationType = builder.operationType;
        this.ramRoleName = builder.ramRoleName;
        this.regionId = builder.regionId;
        this.retainAllResources = builder.retainAllResources;
        this.retainResources = builder.retainResources;
        this.stackId = builder.stackId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStackOperationRisksRequest create() {
        return builder().build();
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return operationType
     */
    public String getOperationType() {
        return this.operationType;
    }

    /**
     * @return ramRoleName
     */
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return retainAllResources
     */
    public Boolean getRetainAllResources() {
        return this.retainAllResources;
    }

    /**
     * @return retainResources
     */
    public java.util.List < String > getRetainResources() {
        return this.retainResources;
    }

    /**
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
    }

    public static final class Builder extends Request.Builder {
        private String clientToken; 
        private String operationType; 
        private String ramRoleName; 
        private String regionId; 
        private Boolean retainAllResources; 
        private java.util.List < String > retainResources; 
        private String stackId; 

        /**
         * <p>ClientToken.</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>OperationType.</p>
         */
        public Builder operationType(String operationType) {
            this.putQueryParameter("OperationType", operationType);
            this.operationType = operationType;
            return this;
        }

        /**
         * <p>RamRoleName.</p>
         */
        public Builder ramRoleName(String ramRoleName) {
            this.putQueryParameter("RamRoleName", ramRoleName);
            this.ramRoleName = ramRoleName;
            return this;
        }

        /**
         * <p>RegionId.</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>RetainAllResources.</p>
         */
        public Builder retainAllResources(Boolean retainAllResources) {
            this.putQueryParameter("RetainAllResources", retainAllResources);
            this.retainAllResources = retainAllResources;
            return this;
        }

        /**
         * <p>RetainResources.</p>
         */
        public Builder retainResources(java.util.List < String > retainResources) {
            this.putQueryParameter("RetainResources", retainResources);
            this.retainResources = retainResources;
            return this;
        }

        /**
         * <p>StackId.</p>
         */
        public Builder stackId(String stackId) {
            this.putQueryParameter("StackId", stackId);
            this.stackId = stackId;
            return this;
        }

        public ListStackOperationRisksRequest build() {
            return new ListStackOperationRisksRequest(this);
        } 

    } 

}
