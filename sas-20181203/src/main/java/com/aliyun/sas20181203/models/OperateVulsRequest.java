// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link OperateVulsRequest} extends {@link RequestModel}
 *
 * <p>OperateVulsRequest</p>
 */
public class OperateVulsRequest extends Request {
    @Query
    @NameInMap("OperateType")
    private String operateType;

    @Query
    @NameInMap("Type")
    private String type;

    @Query
    @NameInMap("Uuids")
    private java.util.List < String > uuids;

    @Query
    @NameInMap("VulNames")
    private java.util.List < String > vulNames;


    private OperateVulsRequest(Builder builder) {
        super(builder);
        this.operateType = builder.operateType;
        this.type = builder.type;
        this.uuids = builder.uuids;
        this.vulNames = builder.vulNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateVulsRequest create() {
        return builder().build();
    }

    /**
     * @return operateType
     */
    public String getOperateType() {
        return this.operateType;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return uuids
     */
    public java.util.List < String > getUuids() {
        return this.uuids;
    }

    /**
     * @return vulNames
     */
    public java.util.List < String > getVulNames() {
        return this.vulNames;
    }

    public static final class Builder extends Request.Builder {
        private String operateType; 
        private String type; 
        private java.util.List < String > uuids; 
        private java.util.List < String > vulNames; 

        /**
         * <p>OperateType.</p>
         */
        public Builder operateType(String operateType) {
            this.putQueryParameter("OperateType", operateType);
            this.operateType = operateType;
            return this;
        }

        /**
         * <p>Type.</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>Uuids.</p>
         */
        public Builder uuids(java.util.List < String > uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        /**
         * <p>VulNames.</p>
         */
        public Builder vulNames(java.util.List < String > vulNames) {
            this.putQueryParameter("VulNames", vulNames);
            this.vulNames = vulNames;
            return this;
        }

        public OperateVulsRequest build() {
            return new OperateVulsRequest(this);
        } 

    } 

}
