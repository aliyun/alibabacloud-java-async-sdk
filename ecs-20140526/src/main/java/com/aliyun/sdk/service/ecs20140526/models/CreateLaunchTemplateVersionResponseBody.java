// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link CreateLaunchTemplateVersionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateLaunchTemplateVersionResponseBody</p>
 */
public class CreateLaunchTemplateVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LaunchTemplateId")
    private String launchTemplateId;

    @com.aliyun.core.annotation.NameInMap("LaunchTemplateVersionNumber")
    private Long launchTemplateVersionNumber;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateLaunchTemplateVersionResponseBody(Builder builder) {
        this.launchTemplateId = builder.launchTemplateId;
        this.launchTemplateVersionNumber = builder.launchTemplateVersionNumber;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLaunchTemplateVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return launchTemplateId
     */
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    /**
     * @return launchTemplateVersionNumber
     */
    public Long getLaunchTemplateVersionNumber() {
        return this.launchTemplateVersionNumber;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String launchTemplateId; 
        private Long launchTemplateVersionNumber; 
        private String requestId; 

        /**
         * <p>The ID of the launch template. For more information, see <a href="https://help.aliyun.com/document_detail/73759.html">DescribeLaunchTemplates</a>.</p>
         * <p>You must specify <code>LaunchTemplateId</code> or <code>LaunchTemplateName</code> to specify a launch template.</p>
         * 
         * <strong>example:</strong>
         * <p>lt-bp1apo0bbbkuy0rj****</p>
         */
        public Builder launchTemplateId(String launchTemplateId) {
            this.launchTemplateId = launchTemplateId;
            return this;
        }

        /**
         * <p>The number of the created version of the launch template.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder launchTemplateVersionNumber(Long launchTemplateVersionNumber) {
            this.launchTemplateVersionNumber = launchTemplateVersionNumber;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DExxxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateLaunchTemplateVersionResponseBody build() {
            return new CreateLaunchTemplateVersionResponseBody(this);
        } 

    } 

}
