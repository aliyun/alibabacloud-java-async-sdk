// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PortCollection} extends {@link TeaModel}
 *
 * <p>PortCollection</p>
 */
public class PortCollection extends TeaModel {
    @NameInMap("GmtCreate")
    private String gmtCreate;

    @NameInMap("GmtModified")
    private String gmtModified;

    @NameInMap("PortCollectionDescription")
    private String portCollectionDescription;

    @NameInMap("PortCollectionId")
    private String portCollectionId;

    @NameInMap("PortCollectionName")
    private String portCollectionName;

    @NameInMap("PortList")
    private java.util.List < Port > portList;

    private PortCollection(Builder builder) {
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.portCollectionDescription = builder.portCollectionDescription;
        this.portCollectionId = builder.portCollectionId;
        this.portCollectionName = builder.portCollectionName;
        this.portList = builder.portList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PortCollection create() {
        return builder().build();
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return portCollectionDescription
     */
    public String getPortCollectionDescription() {
        return this.portCollectionDescription;
    }

    /**
     * @return portCollectionId
     */
    public String getPortCollectionId() {
        return this.portCollectionId;
    }

    /**
     * @return portCollectionName
     */
    public String getPortCollectionName() {
        return this.portCollectionName;
    }

    /**
     * @return portList
     */
    public java.util.List < Port > getPortList() {
        return this.portList;
    }

    public static final class Builder {
        private String gmtCreate; 
        private String gmtModified; 
        private String portCollectionDescription; 
        private String portCollectionId; 
        private String portCollectionName; 
        private java.util.List < Port > portList; 

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * PortCollectionDescription.
         */
        public Builder portCollectionDescription(String portCollectionDescription) {
            this.portCollectionDescription = portCollectionDescription;
            return this;
        }

        /**
         * PortCollectionId.
         */
        public Builder portCollectionId(String portCollectionId) {
            this.portCollectionId = portCollectionId;
            return this;
        }

        /**
         * PortCollectionName.
         */
        public Builder portCollectionName(String portCollectionName) {
            this.portCollectionName = portCollectionName;
            return this;
        }

        /**
         * PortList.
         */
        public Builder portList(java.util.List < Port > portList) {
            this.portList = portList;
            return this;
        }

        public PortCollection build() {
            return new PortCollection(this);
        } 

    } 

}
