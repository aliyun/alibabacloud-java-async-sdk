// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link ForeignInstanceCredInfo} extends {@link TeaModel}
 *
 * <p>ForeignInstanceCredInfo</p>
 */
public class ForeignInstanceCredInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CredInfo")
    private java.util.Map<String, String> credInfo;

    @com.aliyun.core.annotation.NameInMap("CredType")
    private String credType;

    private ForeignInstanceCredInfo(Builder builder) {
        this.credInfo = builder.credInfo;
        this.credType = builder.credType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ForeignInstanceCredInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return credInfo
     */
    public java.util.Map<String, String> getCredInfo() {
        return this.credInfo;
    }

    /**
     * @return credType
     */
    public String getCredType() {
        return this.credType;
    }

    public static final class Builder {
        private java.util.Map<String, String> credInfo; 
        private String credType; 

        private Builder() {
        } 

        private Builder(ForeignInstanceCredInfo model) {
            this.credInfo = model.credInfo;
            this.credType = model.credType;
        } 

        /**
         * CredInfo.
         */
        public Builder credInfo(java.util.Map<String, String> credInfo) {
            this.credInfo = credInfo;
            return this;
        }

        /**
         * CredType.
         */
        public Builder credType(String credType) {
            this.credType = credType;
            return this;
        }

        public ForeignInstanceCredInfo build() {
            return new ForeignInstanceCredInfo(this);
        } 

    } 

}
