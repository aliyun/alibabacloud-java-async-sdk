// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDemonstrationForCustomizedVoiceJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetDemonstrationForCustomizedVoiceJobResponseBody</p>
 */
public class GetDemonstrationForCustomizedVoiceJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDemonstrationForCustomizedVoiceJobResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDemonstrationForCustomizedVoiceJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDemonstrationForCustomizedVoiceJobResponseBody build() {
            return new GetDemonstrationForCustomizedVoiceJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDemonstrationForCustomizedVoiceJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetDemonstrationForCustomizedVoiceJobResponseBody</p>
     */
    public static class DemonstrationList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioId")
        private Integer audioId;

        @com.aliyun.core.annotation.NameInMap("DemoAudio")
        private String demoAudio;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        private DemonstrationList(Builder builder) {
            this.audioId = builder.audioId;
            this.demoAudio = builder.demoAudio;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DemonstrationList create() {
            return builder().build();
        }

        /**
         * @return audioId
         */
        public Integer getAudioId() {
            return this.audioId;
        }

        /**
         * @return demoAudio
         */
        public String getDemoAudio() {
            return this.demoAudio;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private Integer audioId; 
            private String demoAudio; 
            private String text; 

            /**
             * AudioId.
             */
            public Builder audioId(Integer audioId) {
                this.audioId = audioId;
                return this;
            }

            /**
             * DemoAudio.
             */
            public Builder demoAudio(String demoAudio) {
                this.demoAudio = demoAudio;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public DemonstrationList build() {
                return new DemonstrationList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDemonstrationForCustomizedVoiceJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetDemonstrationForCustomizedVoiceJobResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DemonstrationList")
        private java.util.List < DemonstrationList> demonstrationList;

        private Data(Builder builder) {
            this.demonstrationList = builder.demonstrationList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return demonstrationList
         */
        public java.util.List < DemonstrationList> getDemonstrationList() {
            return this.demonstrationList;
        }

        public static final class Builder {
            private java.util.List < DemonstrationList> demonstrationList; 

            /**
             * DemonstrationList.
             */
            public Builder demonstrationList(java.util.List < DemonstrationList> demonstrationList) {
                this.demonstrationList = demonstrationList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
