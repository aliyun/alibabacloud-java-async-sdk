// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWhiteListAssetResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWhiteListAssetResponseBody</p>
 */
public class DescribeWhiteListAssetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Assets")
    private java.util.List < Assets> assets;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeWhiteListAssetResponseBody(Builder builder) {
        this.assets = builder.assets;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWhiteListAssetResponseBody create() {
        return builder().build();
    }

    /**
     * @return assets
     */
    public java.util.List < Assets> getAssets() {
        return this.assets;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Assets> assets; 
        private String requestId; 

        /**
         * The information about the servers.
         */
        public Builder assets(java.util.List < Assets> assets) {
            this.assets = assets;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeWhiteListAssetResponseBody build() {
            return new DescribeWhiteListAssetResponseBody(this);
        } 

    } 

    public static class Assets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowSelected")
        private Integer allowSelected;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Long groupId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("MachineIp")
        private String machineIp;

        @com.aliyun.core.annotation.NameInMap("MachineName")
        private String machineName;

        @com.aliyun.core.annotation.NameInMap("Selected")
        private Integer selected;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private Assets(Builder builder) {
            this.allowSelected = builder.allowSelected;
            this.groupId = builder.groupId;
            this.id = builder.id;
            this.machineIp = builder.machineIp;
            this.machineName = builder.machineName;
            this.selected = builder.selected;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Assets create() {
            return builder().build();
        }

        /**
         * @return allowSelected
         */
        public Integer getAllowSelected() {
            return this.allowSelected;
        }

        /**
         * @return groupId
         */
        public Long getGroupId() {
            return this.groupId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return machineIp
         */
        public String getMachineIp() {
            return this.machineIp;
        }

        /**
         * @return machineName
         */
        public String getMachineName() {
            return this.machineName;
        }

        /**
         * @return selected
         */
        public Integer getSelected() {
            return this.selected;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private Integer allowSelected; 
            private Long groupId; 
            private Long id; 
            private String machineIp; 
            private String machineName; 
            private Integer selected; 
            private String uuid; 

            /**
             * Indicates whether the server can be selected. Valid values:
             * <p>
             * 
             * *   **0**: no
             * *   **1**: yes
             */
            public Builder allowSelected(Integer allowSelected) {
                this.allowSelected = allowSelected;
                return this;
            }

            /**
             * The group ID of the server.
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The ID of the server.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The IP address of the server.
             */
            public Builder machineIp(String machineIp) {
                this.machineIp = machineIp;
                return this;
            }

            /**
             * The name of the server.
             */
            public Builder machineName(String machineName) {
                this.machineName = machineName;
                return this;
            }

            /**
             * Indicates whether the server is selected. Valid values:
             * <p>
             * 
             * *   **0**: no
             * *   **1**: yes
             */
            public Builder selected(Integer selected) {
                this.selected = selected;
                return this;
            }

            /**
             * The UUID of the server.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Assets build() {
                return new Assets(this);
            } 

        } 

    }
}
