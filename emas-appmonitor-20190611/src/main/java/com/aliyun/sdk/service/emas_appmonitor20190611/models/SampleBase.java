// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emas_appmonitor20190611.models;

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
 * {@link SampleBase} extends {@link TeaModel}
 *
 * <p>SampleBase</p>
 */
public class SampleBase extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FullSampleDeviceIds")
    private java.util.List<FullSampleItem> fullSampleDeviceIds;

    @com.aliyun.core.annotation.NameInMap("FullSampleUsers")
    private java.util.List<FullSampleItem> fullSampleUsers;

    @com.aliyun.core.annotation.NameInMap("SampleMethod")
    private String sampleMethod;

    @com.aliyun.core.annotation.NameInMap("SampleRate")
    private Float sampleRate;

    private SampleBase(Builder builder) {
        this.fullSampleDeviceIds = builder.fullSampleDeviceIds;
        this.fullSampleUsers = builder.fullSampleUsers;
        this.sampleMethod = builder.sampleMethod;
        this.sampleRate = builder.sampleRate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SampleBase create() {
        return builder().build();
    }

    /**
     * @return fullSampleDeviceIds
     */
    public java.util.List<FullSampleItem> getFullSampleDeviceIds() {
        return this.fullSampleDeviceIds;
    }

    /**
     * @return fullSampleUsers
     */
    public java.util.List<FullSampleItem> getFullSampleUsers() {
        return this.fullSampleUsers;
    }

    /**
     * @return sampleMethod
     */
    public String getSampleMethod() {
        return this.sampleMethod;
    }

    /**
     * @return sampleRate
     */
    public Float getSampleRate() {
        return this.sampleRate;
    }

    public static final class Builder {
        private java.util.List<FullSampleItem> fullSampleDeviceIds; 
        private java.util.List<FullSampleItem> fullSampleUsers; 
        private String sampleMethod; 
        private Float sampleRate; 

        /**
         * FullSampleDeviceIds.
         */
        public Builder fullSampleDeviceIds(java.util.List<FullSampleItem> fullSampleDeviceIds) {
            this.fullSampleDeviceIds = fullSampleDeviceIds;
            return this;
        }

        /**
         * FullSampleUsers.
         */
        public Builder fullSampleUsers(java.util.List<FullSampleItem> fullSampleUsers) {
            this.fullSampleUsers = fullSampleUsers;
            return this;
        }

        /**
         * SampleMethod.
         */
        public Builder sampleMethod(String sampleMethod) {
            this.sampleMethod = sampleMethod;
            return this;
        }

        /**
         * SampleRate.
         */
        public Builder sampleRate(Float sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }

        public SampleBase build() {
            return new SampleBase(this);
        } 

    } 

}
