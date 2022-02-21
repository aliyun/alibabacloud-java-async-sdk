// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDtsJobRequest} extends {@link RequestModel}
 *
 * <p>ModifyDtsJobRequest</p>
 */
public class ModifyDtsJobRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("DbList")
    private java.util.Map < String, ? > dbList;

    @Query
    @NameInMap("DtsInstanceId")
    @Validation(required = true)
    private String dtsInstanceId;

    @Body
    @NameInMap("EtlOperatorColumnReference")
    private String etlOperatorColumnReference;

    @Body
    @NameInMap("ModifyTypeEnum")
    private String modifyTypeEnum;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Reserved")
    private String reserved;

    @Query
    @NameInMap("SynchronizationDirection")
    private String synchronizationDirection;

    private ModifyDtsJobRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dbList = builder.dbList;
        this.dtsInstanceId = builder.dtsInstanceId;
        this.etlOperatorColumnReference = builder.etlOperatorColumnReference;
        this.modifyTypeEnum = builder.modifyTypeEnum;
        this.regionId = builder.regionId;
        this.reserved = builder.reserved;
        this.synchronizationDirection = builder.synchronizationDirection;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDtsJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dbList
     */
    public java.util.Map < String, ? > getDbList() {
        return this.dbList;
    }

    /**
     * @return dtsInstanceId
     */
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    /**
     * @return etlOperatorColumnReference
     */
    public String getEtlOperatorColumnReference() {
        return this.etlOperatorColumnReference;
    }

    /**
     * @return modifyTypeEnum
     */
    public String getModifyTypeEnum() {
        return this.modifyTypeEnum;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return reserved
     */
    public String getReserved() {
        return this.reserved;
    }

    /**
     * @return synchronizationDirection
     */
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    public static final class Builder extends Request.Builder<ModifyDtsJobRequest, Builder> {
        private String clientToken; 
        private java.util.Map < String, ? > dbList; 
        private String dtsInstanceId; 
        private String etlOperatorColumnReference; 
        private String modifyTypeEnum; 
        private String regionId; 
        private String reserved; 
        private String synchronizationDirection; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDtsJobRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.dbList = response.dbList;
            this.dtsInstanceId = response.dtsInstanceId;
            this.etlOperatorColumnReference = response.etlOperatorColumnReference;
            this.modifyTypeEnum = response.modifyTypeEnum;
            this.regionId = response.regionId;
            this.reserved = response.reserved;
            this.synchronizationDirection = response.synchronizationDirection;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DbList.
         */
        public Builder dbList(java.util.Map < String, ? > dbList) {
            this.putBodyParameter("DbList", dbList);
            this.dbList = dbList;
            return this;
        }

        /**
         * DtsInstanceId.
         */
        public Builder dtsInstanceId(String dtsInstanceId) {
            this.putQueryParameter("DtsInstanceId", dtsInstanceId);
            this.dtsInstanceId = dtsInstanceId;
            return this;
        }

        /**
         * EtlOperatorColumnReference.
         */
        public Builder etlOperatorColumnReference(String etlOperatorColumnReference) {
            this.putBodyParameter("EtlOperatorColumnReference", etlOperatorColumnReference);
            this.etlOperatorColumnReference = etlOperatorColumnReference;
            return this;
        }

        /**
         * 修改任务的方式，当为UPDATE_RESERVED时为修改reserve字段，不传默认修改dbList
         */
        public Builder modifyTypeEnum(String modifyTypeEnum) {
            this.putBodyParameter("ModifyTypeEnum", modifyTypeEnum);
            this.modifyTypeEnum = modifyTypeEnum;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 新增的reserved字段，新增而不是覆盖
         */
        public Builder reserved(String reserved) {
            this.putBodyParameter("Reserved", reserved);
            this.reserved = reserved;
            return this;
        }

        /**
         * SynchronizationDirection.
         */
        public Builder synchronizationDirection(String synchronizationDirection) {
            this.putQueryParameter("SynchronizationDirection", synchronizationDirection);
            this.synchronizationDirection = synchronizationDirection;
            return this;
        }

        @Override
        public ModifyDtsJobRequest build() {
            return new ModifyDtsJobRequest(this);
        } 

    } 

}
