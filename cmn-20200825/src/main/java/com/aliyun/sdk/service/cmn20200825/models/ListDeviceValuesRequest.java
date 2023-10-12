// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeviceValuesRequest} extends {@link RequestModel}
 *
 * <p>ListDeviceValuesRequest</p>
 */
public class ListDeviceValuesRequest extends Request {
    @Query
    @NameInMap("AttributeGroup")
    private String attributeGroup;

    @Query
    @NameInMap("AttributeKeyword")
    @Validation(required = true)
    private String attributeKeyword;

    @Query
    @NameInMap("DeviceFormId")
    private String deviceFormId;

    @Query
    @NameInMap("DeviceFormName")
    private String deviceFormName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private ListDeviceValuesRequest(Builder builder) {
        super(builder);
        this.attributeGroup = builder.attributeGroup;
        this.attributeKeyword = builder.attributeKeyword;
        this.deviceFormId = builder.deviceFormId;
        this.deviceFormName = builder.deviceFormName;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeviceValuesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attributeGroup
     */
    public String getAttributeGroup() {
        return this.attributeGroup;
    }

    /**
     * @return attributeKeyword
     */
    public String getAttributeKeyword() {
        return this.attributeKeyword;
    }

    /**
     * @return deviceFormId
     */
    public String getDeviceFormId() {
        return this.deviceFormId;
    }

    /**
     * @return deviceFormName
     */
    public String getDeviceFormName() {
        return this.deviceFormName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<ListDeviceValuesRequest, Builder> {
        private String attributeGroup; 
        private String attributeKeyword; 
        private String deviceFormId; 
        private String deviceFormName; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ListDeviceValuesRequest request) {
            super(request);
            this.attributeGroup = request.attributeGroup;
            this.attributeKeyword = request.attributeKeyword;
            this.deviceFormId = request.deviceFormId;
            this.deviceFormName = request.deviceFormName;
            this.instanceId = request.instanceId;
        } 

        /**
         * AttributeGroup.
         */
        public Builder attributeGroup(String attributeGroup) {
            this.putQueryParameter("AttributeGroup", attributeGroup);
            this.attributeGroup = attributeGroup;
            return this;
        }

        /**
         * AttributeKeyword.
         */
        public Builder attributeKeyword(String attributeKeyword) {
            this.putQueryParameter("AttributeKeyword", attributeKeyword);
            this.attributeKeyword = attributeKeyword;
            return this;
        }

        /**
         * DeviceFormId.
         */
        public Builder deviceFormId(String deviceFormId) {
            this.putQueryParameter("DeviceFormId", deviceFormId);
            this.deviceFormId = deviceFormId;
            return this;
        }

        /**
         * DeviceFormName.
         */
        public Builder deviceFormName(String deviceFormName) {
            this.putQueryParameter("DeviceFormName", deviceFormName);
            this.deviceFormName = deviceFormName;
            return this;
        }

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public ListDeviceValuesRequest build() {
            return new ListDeviceValuesRequest(this);
        } 

    } 

}
