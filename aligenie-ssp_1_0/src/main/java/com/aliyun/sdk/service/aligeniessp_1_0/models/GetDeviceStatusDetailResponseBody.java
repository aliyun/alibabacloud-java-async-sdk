// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link GetDeviceStatusDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeviceStatusDetailResponseBody</p>
 */
public class GetDeviceStatusDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private GetDeviceStatusDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceStatusDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(GetDeviceStatusDetailResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>Returned error code. 200 indicates that the invocation succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Return Result of invoking this API.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>0EC7*726E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned detailed information.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetDeviceStatusDetailResponseBody build() {
            return new GetDeviceStatusDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDeviceStatusDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeviceStatusDetailResponseBody</p>
     */
    public static class Player extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioAlbum")
        private String audioAlbum;

        @com.aliyun.core.annotation.NameInMap("AudioAnchor")
        private String audioAnchor;

        @com.aliyun.core.annotation.NameInMap("AudioExt")
        private String audioExt;

        @com.aliyun.core.annotation.NameInMap("AudioId")
        private String audioId;

        @com.aliyun.core.annotation.NameInMap("AudioLength")
        private String audioLength;

        @com.aliyun.core.annotation.NameInMap("AudioName")
        private String audioName;

        @com.aliyun.core.annotation.NameInMap("AudioSource")
        private String audioSource;

        @com.aliyun.core.annotation.NameInMap("AudioUrl")
        private String audioUrl;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        private Player(Builder builder) {
            this.audioAlbum = builder.audioAlbum;
            this.audioAnchor = builder.audioAnchor;
            this.audioExt = builder.audioExt;
            this.audioId = builder.audioId;
            this.audioLength = builder.audioLength;
            this.audioName = builder.audioName;
            this.audioSource = builder.audioSource;
            this.audioUrl = builder.audioUrl;
            this.format = builder.format;
            this.progress = builder.progress;
            this.source = builder.source;
            this.status = builder.status;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Player create() {
            return builder().build();
        }

        /**
         * @return audioAlbum
         */
        public String getAudioAlbum() {
            return this.audioAlbum;
        }

        /**
         * @return audioAnchor
         */
        public String getAudioAnchor() {
            return this.audioAnchor;
        }

        /**
         * @return audioExt
         */
        public String getAudioExt() {
            return this.audioExt;
        }

        /**
         * @return audioId
         */
        public String getAudioId() {
            return this.audioId;
        }

        /**
         * @return audioLength
         */
        public String getAudioLength() {
            return this.audioLength;
        }

        /**
         * @return audioName
         */
        public String getAudioName() {
            return this.audioName;
        }

        /**
         * @return audioSource
         */
        public String getAudioSource() {
            return this.audioSource;
        }

        /**
         * @return audioUrl
         */
        public String getAudioUrl() {
            return this.audioUrl;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String audioAlbum; 
            private String audioAnchor; 
            private String audioExt; 
            private String audioId; 
            private String audioLength; 
            private String audioName; 
            private String audioSource; 
            private String audioUrl; 
            private String format; 
            private String progress; 
            private String source; 
            private String status; 
            private String timestamp; 

            private Builder() {
            } 

            private Builder(Player model) {
                this.audioAlbum = model.audioAlbum;
                this.audioAnchor = model.audioAnchor;
                this.audioExt = model.audioExt;
                this.audioId = model.audioId;
                this.audioLength = model.audioLength;
                this.audioName = model.audioName;
                this.audioSource = model.audioSource;
                this.audioUrl = model.audioUrl;
                this.format = model.format;
                this.progress = model.progress;
                this.source = model.source;
                this.status = model.status;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>Song Album</p>
             */
            public Builder audioAlbum(String audioAlbum) {
                this.audioAlbum = audioAlbum;
                return this;
            }

            /**
             * <p>Artist</p>
             * 
             * <strong>example:</strong>
             * <p>刘德华</p>
             */
            public Builder audioAnchor(String audioAnchor) {
                this.audioAnchor = audioAnchor;
                return this;
            }

            /**
             * <p>Extension Information</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder audioExt(String audioExt) {
                this.audioExt = audioExt;
                return this;
            }

            /**
             * <p>Audio ID</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder audioId(String audioId) {
                this.audioId = audioId;
                return this;
            }

            /**
             * <p>Song length, in seconds</p>
             * 
             * <strong>example:</strong>
             * <p>253</p>
             */
            public Builder audioLength(String audioLength) {
                this.audioLength = audioLength;
                return this;
            }

            /**
             * <p>Song Name</p>
             */
            public Builder audioName(String audioName) {
                this.audioName = audioName;
                return this;
            }

            /**
             * <p>Song Source (xiami)</p>
             * 
             * <strong>example:</strong>
             * <p>xiami</p>
             */
            public Builder audioSource(String audioSource) {
                this.audioSource = audioSource;
                return this;
            }

            /**
             * <p>Song URL</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxx">https://xxx</a></p>
             */
            public Builder audioUrl(String audioUrl) {
                this.audioUrl = audioUrl;
                return this;
            }

            /**
             * <p>Song Type (mp3)</p>
             * 
             * <strong>example:</strong>
             * <p>mp3</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>Playback progress</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>Playback Source (cloud)</p>
             * 
             * <strong>example:</strong>
             * <p>cloud</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>Playback status, pause</p>
             * 
             * <strong>example:</strong>
             * <p>pause</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Reporting Time</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Player build() {
                return new Player(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDeviceStatusDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeviceStatusDetailResponseBody</p>
     */
    public static class Power extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Quantity")
        private Integer quantity;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Power(Builder builder) {
            this.quantity = builder.quantity;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Power create() {
            return builder().build();
        }

        /**
         * @return quantity
         */
        public Integer getQuantity() {
            return this.quantity;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer quantity; 
            private String status; 

            private Builder() {
            } 

            private Builder(Power model) {
                this.quantity = model.quantity;
                this.status = model.status;
            } 

            /**
             * <p>Battery value</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder quantity(Integer quantity) {
                this.quantity = quantity;
                return this;
            }

            /**
             * <p>Power status</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Power build() {
                return new Power(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDeviceStatusDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeviceStatusDetailResponseBody</p>
     */
    public static class Speaker extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Muted")
        private Boolean muted;

        @com.aliyun.core.annotation.NameInMap("Volume")
        private Integer volume;

        private Speaker(Builder builder) {
            this.muted = builder.muted;
            this.volume = builder.volume;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Speaker create() {
            return builder().build();
        }

        /**
         * @return muted
         */
        public Boolean getMuted() {
            return this.muted;
        }

        /**
         * @return volume
         */
        public Integer getVolume() {
            return this.volume;
        }

        public static final class Builder {
            private Boolean muted; 
            private Integer volume; 

            private Builder() {
            } 

            private Builder(Speaker model) {
                this.muted = model.muted;
                this.volume = model.volume;
            } 

            /**
             * <p>Is muted</p>
             */
            public Builder muted(Boolean muted) {
                this.muted = muted;
                return this;
            }

            /**
             * <p>Current volume value</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder volume(Integer volume) {
                this.volume = volume;
                return this;
            }

            public Speaker build() {
                return new Speaker(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDeviceStatusDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeviceStatusDetailResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Player")
        private Player player;

        @com.aliyun.core.annotation.NameInMap("Power")
        private Power power;

        @com.aliyun.core.annotation.NameInMap("Speaker")
        private Speaker speaker;

        private Result(Builder builder) {
            this.player = builder.player;
            this.power = builder.power;
            this.speaker = builder.speaker;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return player
         */
        public Player getPlayer() {
            return this.player;
        }

        /**
         * @return power
         */
        public Power getPower() {
            return this.power;
        }

        /**
         * @return speaker
         */
        public Speaker getSpeaker() {
            return this.speaker;
        }

        public static final class Builder {
            private Player player; 
            private Power power; 
            private Speaker speaker; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.player = model.player;
                this.power = model.power;
                this.speaker = model.speaker;
            } 

            /**
             * <p>Player information</p>
             */
            public Builder player(Player player) {
                this.player = player;
                return this;
            }

            /**
             * <p>Battery information</p>
             */
            public Builder power(Power power) {
                this.power = power;
                return this;
            }

            /**
             * <p>Volume information</p>
             */
            public Builder speaker(Speaker speaker) {
                this.speaker = speaker;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
