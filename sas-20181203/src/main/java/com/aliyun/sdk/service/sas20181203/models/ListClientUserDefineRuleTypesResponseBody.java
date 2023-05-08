// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClientUserDefineRuleTypesResponseBody} extends {@link TeaModel}
 *
 * <p>ListClientUserDefineRuleTypesResponseBody</p>
 */
public class ListClientUserDefineRuleTypesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UserDefineRuleTypes")
    private java.util.List < String > userDefineRuleTypes;

    private ListClientUserDefineRuleTypesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userDefineRuleTypes = builder.userDefineRuleTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClientUserDefineRuleTypesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userDefineRuleTypes
     */
    public java.util.List < String > getUserDefineRuleTypes() {
        return this.userDefineRuleTypes;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < String > userDefineRuleTypes; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UserDefineRuleTypes.
         */
        public Builder userDefineRuleTypes(java.util.List < String > userDefineRuleTypes) {
            this.userDefineRuleTypes = userDefineRuleTypes;
            return this;
        }

        public ListClientUserDefineRuleTypesResponseBody build() {
            return new ListClientUserDefineRuleTypesResponseBody(this);
        } 

    } 

}
