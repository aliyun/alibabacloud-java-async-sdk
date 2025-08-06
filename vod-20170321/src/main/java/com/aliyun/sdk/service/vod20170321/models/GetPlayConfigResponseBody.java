// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetPlayConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetPlayConfigResponseBody</p>
 */
public class GetPlayConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigType")
    private String configType;

    @com.aliyun.core.annotation.NameInMap("PlayDeviceAbilityList")
    private java.util.List<String> playDeviceAbilityList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetPlayConfigResponseBody(Builder builder) {
        this.configType = builder.configType;
        this.playDeviceAbilityList = builder.playDeviceAbilityList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPlayConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configType
     */
    public String getConfigType() {
        return this.configType;
    }

    /**
     * @return playDeviceAbilityList
     */
    public java.util.List<String> getPlayDeviceAbilityList() {
        return this.playDeviceAbilityList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String configType; 
        private java.util.List<String> playDeviceAbilityList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetPlayConfigResponseBody model) {
            this.configType = model.configType;
            this.playDeviceAbilityList = model.playDeviceAbilityList;
            this.requestId = model.requestId;
        } 

        /**
         * ConfigType.
         */
        public Builder configType(String configType) {
            this.configType = configType;
            return this;
        }

        /**
         * PlayDeviceAbilityList.
         */
        public Builder playDeviceAbilityList(java.util.List<String> playDeviceAbilityList) {
            this.playDeviceAbilityList = playDeviceAbilityList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPlayConfigResponseBody build() {
            return new GetPlayConfigResponseBody(this);
        } 

    } 

}
