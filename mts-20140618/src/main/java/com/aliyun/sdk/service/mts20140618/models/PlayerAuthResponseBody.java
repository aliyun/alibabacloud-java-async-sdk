// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PlayerAuthResponseBody} extends {@link TeaModel}
 *
 * <p>PlayerAuthResponseBody</p>
 */
public class PlayerAuthResponseBody extends TeaModel {
    @NameInMap("LogURL")
    private String logURL;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SwitchList")
    private SwitchList switchList;

    private PlayerAuthResponseBody(Builder builder) {
        this.logURL = builder.logURL;
        this.requestId = builder.requestId;
        this.switchList = builder.switchList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PlayerAuthResponseBody create() {
        return builder().build();
    }

    /**
     * @return logURL
     */
    public String getLogURL() {
        return this.logURL;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return switchList
     */
    public SwitchList getSwitchList() {
        return this.switchList;
    }

    public static final class Builder {
        private String logURL; 
        private String requestId; 
        private SwitchList switchList; 

        /**
         * LogURL.
         */
        public Builder logURL(String logURL) {
            this.logURL = logURL;
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
         * SwitchList.
         */
        public Builder switchList(SwitchList switchList) {
            this.switchList = switchList;
            return this;
        }

        public PlayerAuthResponseBody build() {
            return new PlayerAuthResponseBody(this);
        } 

    } 

    public static class Switch extends TeaModel {
        @NameInMap("FunctionId")
        private String functionId;

        @NameInMap("FunctionName")
        private String functionName;

        @NameInMap("State")
        private String state;

        @NameInMap("SwitchId")
        private String switchId;

        private Switch(Builder builder) {
            this.functionId = builder.functionId;
            this.functionName = builder.functionName;
            this.state = builder.state;
            this.switchId = builder.switchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Switch create() {
            return builder().build();
        }

        /**
         * @return functionId
         */
        public String getFunctionId() {
            return this.functionId;
        }

        /**
         * @return functionName
         */
        public String getFunctionName() {
            return this.functionName;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return switchId
         */
        public String getSwitchId() {
            return this.switchId;
        }

        public static final class Builder {
            private String functionId; 
            private String functionName; 
            private String state; 
            private String switchId; 

            /**
             * FunctionId.
             */
            public Builder functionId(String functionId) {
                this.functionId = functionId;
                return this;
            }

            /**
             * FunctionName.
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * SwitchId.
             */
            public Builder switchId(String switchId) {
                this.switchId = switchId;
                return this;
            }

            public Switch build() {
                return new Switch(this);
            } 

        } 

    }
    public static class SwitchList extends TeaModel {
        @NameInMap("Switch")
        private java.util.List < Switch> _switch;

        private SwitchList(Builder builder) {
            this._switch = builder._switch;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SwitchList create() {
            return builder().build();
        }

        /**
         * @return _switch
         */
        public java.util.List < Switch> get_switch() {
            return this._switch;
        }

        public static final class Builder {
            private java.util.List < Switch> _switch; 

            /**
             * Switch.
             */
            public Builder _switch(java.util.List < Switch> _switch) {
                this._switch = _switch;
                return this;
            }

            public SwitchList build() {
                return new SwitchList(this);
            } 

        } 

    }
}
