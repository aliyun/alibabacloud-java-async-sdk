// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link ExportDesktopGroupInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ExportDesktopGroupInfoResponseBody</p>
 */
public class ExportDesktopGroupInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    private ExportDesktopGroupInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportDesktopGroupInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String requestId; 
        private String url; 

        private Builder() {
        } 

        private Builder(ExportDesktopGroupInfoResponseBody model) {
            this.requestId = model.requestId;
            this.url = model.url;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>24E05D3E-08F4-551E-B1F0-F6D84EE0BCCC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The URL from which you can download the exported cloud computer pools. The details of the cloud computer pools include:</p>
         * <ul>
         * <li>IDs and names of the cloud computer pools</li>
         * <li>IDs and names of the office networks</li>
         * <li>Cloud computer pool templates</li>
         * <li>Number of CPU cores and memory size</li>
         * <li>System disks and data disks</li>
         * <li>Names of security policies</li>
         * <li>Number of current authorized users</li>
         * <li>Billing methods</li>
         * <li>The time when the cloud computer pools were created</li>
         * <li>The time when the cloud computer pools expire</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cn-hangzhou-servicemanager.oss-cn-hangzhou.aliyuncs.com/A0_DESKTOP/EDS_CloudDesktopGroups_202203********_xBjqdCT***.xlsx">https://cn-hangzhou-servicemanager.oss-cn-hangzhou.aliyuncs.com/A0_DESKTOP/EDS_CloudDesktopGroups_202203********_xBjqdCT***.xlsx</a>?*********</p>
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public ExportDesktopGroupInfoResponseBody build() {
            return new ExportDesktopGroupInfoResponseBody(this);
        } 

    } 

}
