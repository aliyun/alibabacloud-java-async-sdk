// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gws20190618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterPolicyResponseBody</p>
 */
public class DescribeClusterPolicyResponseBody extends TeaModel {
    @NameInMap("Audio")
    private String audio;

    @NameInMap("Clipboard")
    private String clipboard;

    @NameInMap("DomainList")
    private String domainList;

    @NameInMap("LocalDrive")
    private String localDrive;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskFinished")
    private Boolean taskFinished;

    @NameInMap("TaskId")
    private String taskId;

    @NameInMap("UdpPort")
    private String udpPort;

    @NameInMap("UsbRedirect")
    private String usbRedirect;

    @NameInMap("Watermark")
    private String watermark;

    private DescribeClusterPolicyResponseBody(Builder builder) {
        this.audio = builder.audio;
        this.clipboard = builder.clipboard;
        this.domainList = builder.domainList;
        this.localDrive = builder.localDrive;
        this.requestId = builder.requestId;
        this.taskFinished = builder.taskFinished;
        this.taskId = builder.taskId;
        this.udpPort = builder.udpPort;
        this.usbRedirect = builder.usbRedirect;
        this.watermark = builder.watermark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return audio
     */
    public String getAudio() {
        return this.audio;
    }

    /**
     * @return clipboard
     */
    public String getClipboard() {
        return this.clipboard;
    }

    /**
     * @return domainList
     */
    public String getDomainList() {
        return this.domainList;
    }

    /**
     * @return localDrive
     */
    public String getLocalDrive() {
        return this.localDrive;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskFinished
     */
    public Boolean getTaskFinished() {
        return this.taskFinished;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return udpPort
     */
    public String getUdpPort() {
        return this.udpPort;
    }

    /**
     * @return usbRedirect
     */
    public String getUsbRedirect() {
        return this.usbRedirect;
    }

    /**
     * @return watermark
     */
    public String getWatermark() {
        return this.watermark;
    }

    public static final class Builder {
        private String audio; 
        private String clipboard; 
        private String domainList; 
        private String localDrive; 
        private String requestId; 
        private Boolean taskFinished; 
        private String taskId; 
        private String udpPort; 
        private String usbRedirect; 
        private String watermark; 

        /**
         * Audio.
         */
        public Builder audio(String audio) {
            this.audio = audio;
            return this;
        }

        /**
         * Clipboard.
         */
        public Builder clipboard(String clipboard) {
            this.clipboard = clipboard;
            return this;
        }

        /**
         * DomainList.
         */
        public Builder domainList(String domainList) {
            this.domainList = domainList;
            return this;
        }

        /**
         * LocalDrive.
         */
        public Builder localDrive(String localDrive) {
            this.localDrive = localDrive;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TaskFinished.
         */
        public Builder taskFinished(Boolean taskFinished) {
            this.taskFinished = taskFinished;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * UdpPort.
         */
        public Builder udpPort(String udpPort) {
            this.udpPort = udpPort;
            return this;
        }

        /**
         * UsbRedirect.
         */
        public Builder usbRedirect(String usbRedirect) {
            this.usbRedirect = usbRedirect;
            return this;
        }

        /**
         * Watermark.
         */
        public Builder watermark(String watermark) {
            this.watermark = watermark;
            return this;
        }

        public DescribeClusterPolicyResponseBody build() {
            return new DescribeClusterPolicyResponseBody(this);
        } 

    } 

}
