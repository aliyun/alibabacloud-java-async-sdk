// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link DescribeAntAndCloudAuthUserStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAntAndCloudAuthUserStatusResponseBody</p>
 */
public class DescribeAntAndCloudAuthUserStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AntcloudauthEnabled")
    private Boolean antcloudauthEnabled;

    @com.aliyun.core.annotation.NameInMap("CloudauthEnabled")
    private Boolean cloudauthEnabled;

    @com.aliyun.core.annotation.NameInMap("CloudauthstEnabled")
    private Boolean cloudauthstEnabled;

    @com.aliyun.core.annotation.NameInMap("InforverifyEnabled")
    private Boolean inforverifyEnabled;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAntAndCloudAuthUserStatusResponseBody(Builder builder) {
        this.antcloudauthEnabled = builder.antcloudauthEnabled;
        this.cloudauthEnabled = builder.cloudauthEnabled;
        this.cloudauthstEnabled = builder.cloudauthstEnabled;
        this.inforverifyEnabled = builder.inforverifyEnabled;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntAndCloudAuthUserStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return antcloudauthEnabled
     */
    public Boolean getAntcloudauthEnabled() {
        return this.antcloudauthEnabled;
    }

    /**
     * @return cloudauthEnabled
     */
    public Boolean getCloudauthEnabled() {
        return this.cloudauthEnabled;
    }

    /**
     * @return cloudauthstEnabled
     */
    public Boolean getCloudauthstEnabled() {
        return this.cloudauthstEnabled;
    }

    /**
     * @return inforverifyEnabled
     */
    public Boolean getInforverifyEnabled() {
        return this.inforverifyEnabled;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean antcloudauthEnabled; 
        private Boolean cloudauthEnabled; 
        private Boolean cloudauthstEnabled; 
        private Boolean inforverifyEnabled; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAntAndCloudAuthUserStatusResponseBody model) {
            this.antcloudauthEnabled = model.antcloudauthEnabled;
            this.cloudauthEnabled = model.cloudauthEnabled;
            this.cloudauthstEnabled = model.cloudauthstEnabled;
            this.inforverifyEnabled = model.inforverifyEnabled;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether financial-grade real-person authentication is activated. Values:</p>
         * <ul>
         * <li><strong>true</strong>: Activated</li>
         * <li><strong>false</strong>: Not activated</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder antcloudauthEnabled(Boolean antcloudauthEnabled) {
            this.antcloudauthEnabled = antcloudauthEnabled;
            return this;
        }

        /**
         * <p>Indicates whether real-person authentication is activated. Values:</p>
         * <ul>
         * <li><strong>true</strong>: Activated</li>
         * <li><strong>false</strong>: Not activated</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder cloudauthEnabled(Boolean cloudauthEnabled) {
            this.cloudauthEnabled = cloudauthEnabled;
            return this;
        }

        /**
         * <p>Indicates whether the enhanced version of real-person authentication is activated. Values:</p>
         * <ul>
         * <li><strong>true</strong>: Activated</li>
         * <li><strong>false</strong>: Not activated</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder cloudauthstEnabled(Boolean cloudauthstEnabled) {
            this.cloudauthstEnabled = cloudauthstEnabled;
            return this;
        }

        /**
         * <p>Indicates whether information verification is activated. Values:</p>
         * <ul>
         * <li><strong>true</strong>: Activated</li>
         * <li><strong>false</strong>: Not activated</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder inforverifyEnabled(Boolean inforverifyEnabled) {
            this.inforverifyEnabled = inforverifyEnabled;
            return this;
        }

        /**
         * <p>The ID of this request.</p>
         * 
         * <strong>example:</strong>
         * <p>3FE07CCE-DF47-51C2-9D32-CD70ED62C91B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAntAndCloudAuthUserStatusResponseBody build() {
            return new DescribeAntAndCloudAuthUserStatusResponseBody(this);
        } 

    } 

}
